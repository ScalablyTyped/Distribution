package typings.yn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("yn", JSImport.Namespace)
  @js.native
  def apply(input: js.Any): js.UndefOr[Boolean] = js.native
  @JSImport("yn", JSImport.Namespace)
  @js.native
  def apply(input: js.Any, options: Options): js.UndefOr[Boolean] = js.native
  /**
  Parse yes/no like values.
  The following case-insensitive values are recognized: `'y', 'yes', 'true', true, '1', 1, 'n', 'no', 'false', false, '0', 0`, 'on', 'off'
  @param input - Value that should be converted.
  @returns The parsed input if it can be parsed or the default value defined in the `default` option.
  @example
  ```
  import yn = require('yn');
  yn('y');
  //=> true
  yn('NO');
  //=> false
  yn(true);
  //=> true
  yn('abomasum');
  //=> undefined
  yn('abomasum', {default: false});
  //=> false
  yn('mo', {lenient: true});
  //=> false
  ```
  */
  @JSImport("yn", JSImport.Namespace)
  @js.native
  def apply(input: js.Any, options: OptionsWithDefault): Boolean = js.native
  
  @js.native
  trait Options extends StObject {
    
    /**
    		Default value if no match was found.
    		@default undefined
    		*/
    val default: js.UndefOr[Boolean] = js.native
    
    /**
    		Use a key distance-based score to leniently accept typos of `yes` and `no`.
    		@default false
    		*/
    val lenient: js.UndefOr[Boolean] = js.native
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
      def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultUndefined: Self = StObject.set(x, "default", js.undefined)
      
      @scala.inline
      def setLenient(value: Boolean): Self = StObject.set(x, "lenient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLenientUndefined: Self = StObject.set(x, "lenient", js.undefined)
    }
  }
  
  @js.native
  trait OptionsWithDefault extends Options {
    
    @JSName("default")
    var default_OptionsWithDefault: Boolean = js.native
  }
  object OptionsWithDefault {
    
    @scala.inline
    def apply(default: Boolean): OptionsWithDefault = {
      val __obj = js.Dynamic.literal(default = default.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionsWithDefault]
    }
    
    @scala.inline
    implicit class OptionsWithDefaultMutableBuilder[Self <: OptionsWithDefault] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefault(value: Boolean): Self = StObject.set(x, "default", value.asInstanceOf[js.Any])
    }
  }
}
