package typings.toSemver

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Get an array of valid, sorted, and cleaned [semver](https://semver.org/) versions from an array of strings.
  @example
  ```
  import toSemver = require('to-semver');
  toSemver([
  	'v1.3.16',
  	'v1.7.0',
  	'test',
  	'v1.6.9'
  ]);
  // [
  // 	'1.7.0',
  // 	'1.6.9'
  // 	'1.3.16'
  // ]
  ```
  */
  @JSImport("to-semver", JSImport.Namespace)
  @js.native
  def apply(versions: js.Array[String]): js.Array[String] = js.native
  @JSImport("to-semver", JSImport.Namespace)
  @js.native
  def apply(versions: js.Array[String], options: Options): js.Array[String] = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Clean versions. For example `v1.3.0` → `1.3.0`.
    		@default true
    		*/
    val clean: js.UndefOr[Boolean] = js.native
    
    /**
    		Include prereleases, like `1.2.3-alpha.3`.
    		@default true
    		*/
    val includePrereleases: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClean(value: Boolean): Self = StObject.set(x, "clean", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCleanUndefined: Self = StObject.set(x, "clean", js.undefined)
      
      @scala.inline
      def setIncludePrereleases(value: Boolean): Self = StObject.set(x, "includePrereleases", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIncludePrereleasesUndefined: Self = StObject.set(x, "includePrereleases", js.undefined)
    }
  }
}
