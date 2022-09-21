package typings.typesEslintrc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait ExperimentalObjectRestSpread extends StObject {
    
    /**
      * @deprecated Previously, when using the default parser it was possible to use the experimentalObjectRestSpread option to enable support for rest/spread properties.
      */
    var experimentalObjectRestSpread: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Allow return statements in the global scope
      */
    var globalReturn: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable global strict mode (if ecmaVersion is 5 or greater)
      */
    var impliedStrict: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Enable JSX
      */
    var jsx: js.UndefOr[Boolean] = js.undefined
  }
  object ExperimentalObjectRestSpread {
    
    inline def apply(): ExperimentalObjectRestSpread = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ExperimentalObjectRestSpread]
    }
    
    extension [Self <: ExperimentalObjectRestSpread](x: Self) {
      
      inline def setExperimentalObjectRestSpread(value: Boolean): Self = StObject.set(x, "experimentalObjectRestSpread", value.asInstanceOf[js.Any])
      
      inline def setExperimentalObjectRestSpreadUndefined: Self = StObject.set(x, "experimentalObjectRestSpread", js.undefined)
      
      inline def setGlobalReturn(value: Boolean): Self = StObject.set(x, "globalReturn", value.asInstanceOf[js.Any])
      
      inline def setGlobalReturnUndefined: Self = StObject.set(x, "globalReturn", js.undefined)
      
      inline def setImpliedStrict(value: Boolean): Self = StObject.set(x, "impliedStrict", value.asInstanceOf[js.Any])
      
      inline def setImpliedStrictUndefined: Self = StObject.set(x, "impliedStrict", js.undefined)
      
      inline def setJsx(value: Boolean): Self = StObject.set(x, "jsx", value.asInstanceOf[js.Any])
      
      inline def setJsxUndefined: Self = StObject.set(x, "jsx", js.undefined)
    }
  }
}
