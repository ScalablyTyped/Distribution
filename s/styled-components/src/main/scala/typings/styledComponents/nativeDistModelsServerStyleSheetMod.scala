package typings.styledComponents

import typings.node.streamMod.Readable
import typings.node.streamMod.Transform
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object nativeDistModelsServerStyleSheetMod {
  
  @JSImport("styled-components/native/dist/models/ServerStyleSheet", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with ServerStyleSheet {
    
    /* CompleteClass */
    override def _emitSheetCSS(): String = js.native
    
    /* CompleteClass */
    override def collectStyles(children: Any): Element = js.native
    
    /* CompleteClass */
    override def getStyleElement(): js.Array[Element] = js.native
    
    /* CompleteClass */
    override def getStyleTags(): String = js.native
    
    /* CompleteClass */
    var instance: typings.styledComponents.nativeDistSheetMod.default = js.native
    
    /* CompleteClass */
    override def interleaveWithNodeStream(input: Readable): Transform = js.native
    
    /* CompleteClass */
    override def seal(): Unit = js.native
    
    /* CompleteClass */
    var `sealed`: Boolean = js.native
  }
  
  trait ServerStyleSheet extends StObject {
    
    def _emitSheetCSS(): String
    
    def collectStyles(children: Any): Element
    
    def getStyleElement(): js.Array[Element]
    
    def getStyleTags(): String
    
    var instance: typings.styledComponents.nativeDistSheetMod.default
    
    def interleaveWithNodeStream(input: Readable): Transform
    
    def seal(): Unit
    
    var `sealed`: Boolean
  }
  object ServerStyleSheet {
    
    inline def apply(
      _emitSheetCSS: () => String,
      collectStyles: Any => Element,
      getStyleElement: () => js.Array[Element],
      getStyleTags: () => String,
      instance: typings.styledComponents.nativeDistSheetMod.default,
      interleaveWithNodeStream: Readable => Transform,
      seal: () => Unit,
      `sealed`: Boolean
    ): ServerStyleSheet = {
      val __obj = js.Dynamic.literal(_emitSheetCSS = js.Any.fromFunction0(_emitSheetCSS), collectStyles = js.Any.fromFunction1(collectStyles), getStyleElement = js.Any.fromFunction0(getStyleElement), getStyleTags = js.Any.fromFunction0(getStyleTags), instance = instance.asInstanceOf[js.Any], interleaveWithNodeStream = js.Any.fromFunction1(interleaveWithNodeStream), seal = js.Any.fromFunction0(seal))
      __obj.updateDynamic("sealed")(`sealed`.asInstanceOf[js.Any])
      __obj.asInstanceOf[ServerStyleSheet]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerStyleSheet] (val x: Self) extends AnyVal {
      
      inline def setCollectStyles(value: Any => Element): Self = StObject.set(x, "collectStyles", js.Any.fromFunction1(value))
      
      inline def setGetStyleElement(value: () => js.Array[Element]): Self = StObject.set(x, "getStyleElement", js.Any.fromFunction0(value))
      
      inline def setGetStyleTags(value: () => String): Self = StObject.set(x, "getStyleTags", js.Any.fromFunction0(value))
      
      inline def setInstance(value: typings.styledComponents.nativeDistSheetMod.default): Self = StObject.set(x, "instance", value.asInstanceOf[js.Any])
      
      inline def setInterleaveWithNodeStream(value: Readable => Transform): Self = StObject.set(x, "interleaveWithNodeStream", js.Any.fromFunction1(value))
      
      inline def setSeal(value: () => Unit): Self = StObject.set(x, "seal", js.Any.fromFunction0(value))
      
      inline def setSealed(value: Boolean): Self = StObject.set(x, "sealed", value.asInstanceOf[js.Any])
      
      inline def set_emitSheetCSS(value: () => String): Self = StObject.set(x, "_emitSheetCSS", js.Any.fromFunction0(value))
    }
  }
}
