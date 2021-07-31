package typings.yn

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply(input: js.Any): js.UndefOr[Boolean] = ^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[Boolean]]
  @scala.inline
  def apply(input: js.Any, options: Options): js.UndefOr[Boolean] = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[Boolean]]
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
  @scala.inline
  def apply(input: js.Any, options: OptionsWithDefault): Boolean = (^.asInstanceOf[js.Dynamic].apply(input.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("yn", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Options extends StObject {
    
    /**
    		Default value if no match was found.
    		@default undefined
    		*/
    val default: js.UndefOr[Boolean] = js.undefined
    
    /**
    		Use a key distance-based score to leniently accept typos of `yes` and `no`.
    		@default false
    		*/
    val lenient: js.UndefOr[Boolean] = js.undefined
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
  
  trait OptionsWithDefault
    extends StObject
       with Options {
    
    @JSName("default")
    var default_OptionsWithDefault: Boolean
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
