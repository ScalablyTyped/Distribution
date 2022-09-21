package typings.testingLibraryUserEvent

import typings.std.HTMLTextAreaElement
import typings.std.Parameters
import typings.testingLibraryUserEvent.anon.ApplyNative
import typings.testingLibraryUserEvent.cssPointerEventsMod.global.Element
import typings.testingLibraryUserEvent.setFilesMod.global.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object interceptorMod {
  
  @JSImport("@testing-library/user-event/dist/types/document/interceptor", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def prepareInterceptor[ElementType /* <: Element */, PropName /* <: /* keyof ElementType */ String */](
    element: ElementType,
    propName: PropName,
    interceptorImpl: js.ThisFunction1[
      /* this */ ElementType, 
      /* args */ Params[
        /* import warning: importer.ImportType#apply Failed type conversion: ElementType[PropName] */ js.Any
      ], 
      ApplyNative[ElementType, PropName]
    ]
  ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("prepareInterceptor")(element.asInstanceOf[js.Any], propName.asInstanceOf[js.Any], interceptorImpl.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def prepareRangeTextInterceptor(element: HTMLTextAreaElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareRangeTextInterceptor")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def prepareRangeTextInterceptor(element: HTMLInputElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareRangeTextInterceptor")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def prepareSelectionInterceptor(element: HTMLTextAreaElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareSelectionInterceptor")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def prepareSelectionInterceptor(element: HTMLInputElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareSelectionInterceptor")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  inline def prepareValueInterceptor(element: HTMLTextAreaElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareValueInterceptor")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def prepareValueInterceptor(element: HTMLInputElement): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("prepareValueInterceptor")(element.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  type ImplReturn[Prop] = Prop | Parameters[Prop]
  
  type Params[Prop] = js.Array[Prop] | Parameters[Prop]
  
  @js.native
  trait anyFunc extends StObject {
    
    def apply(a: Any*): Any = js.native
  }
}
