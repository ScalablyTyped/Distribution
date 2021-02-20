package typings.writePkg

import typings.typeFest.basicMod.JsonObject
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("write-pkg", JSImport.Namespace)
  @js.native
  def apply(data: JsonObject): js.Promise[Unit] = js.native
  @JSImport("write-pkg", JSImport.Namespace)
  @js.native
  def apply(data: JsonObject, options: Options): js.Promise[Unit] = js.native
  /**
  	Write a `package.json` file.
  	Writes atomically and creates directories for you as needed. Sorts dependencies when writing. Preserves the indentation if the file already exists.
  	@param path - Path to where the `package.json` file should be written or its directory.
  	@example
  	```
  	import * as path from 'path';
  	import writePackage = require('write-pkg');
  	(async () => {
  		await writePackage({foo: true});
  		console.log('done');
  		await writePackage(__dirname, {foo: true});
  		console.log('done');
  		await writePackage(path.join('unicorn', 'package.json'), {foo: true});
  		console.log('done');
  	})();
  	```
  	*/
  @JSImport("write-pkg", JSImport.Namespace)
  @js.native
  def apply(path: String, data: JsonObject): js.Promise[Unit] = js.native
  @JSImport("write-pkg", JSImport.Namespace)
  @js.native
  def apply(path: String, data: JsonObject, options: Options): js.Promise[Unit] = js.native
  
  @JSImport("write-pkg", "sync")
  @js.native
  def sync(data: JsonObject): Unit = js.native
  @JSImport("write-pkg", "sync")
  @js.native
  def sync(data: JsonObject, options: Options): Unit = js.native
  /**
  	Synchronously write a `package.json` file.
  	Writes atomically and creates directories for you as needed. Sorts dependencies when writing. Preserves the indentation if the file already exists.
  	@param path - Path to where the `package.json` file should be written or its directory.
  	@example
  	```
  	import * as path from 'path';
  	import writePackage = require('write-pkg');
  	writePackage.sync({foo: true});
  	console.log('done');
  	writePackage.sync(__dirname, {foo: true});
  	console.log('done');
  	writePackage.sync(path.join('unicorn', 'package.json'), {foo: true});
  	console.log('done');
  	```
  	*/
  @JSImport("write-pkg", "sync")
  @js.native
  def sync(path: String, data: JsonObject): Unit = js.native
  @JSImport("write-pkg", "sync")
  @js.native
  def sync(path: String, data: JsonObject, options: Options): Unit = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Remove empty `dependencies`, `devDependencies`, `optionalDependencies` and `peerDependencies` objects.
    		@default true
    		*/
    val normalize: js.UndefOr[Boolean] = js.native
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
      def setNormalize(value: Boolean): Self = StObject.set(x, "normalize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNormalizeUndefined: Self = StObject.set(x, "normalize", js.undefined)
    }
  }
}
