package typings.testingLibraryUserEvent

import typings.std.HTMLTextAreaElement
import typings.testingLibraryUserEvent.anon.ApplyNative
import typings.testingLibraryUserEvent.distTypesUtilsEditSetFilesMod.global.HTMLInputElement
import typings.testingLibraryUserEvent.distTypesUtilsPointerCssPointerEventsMod.global.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesDocumentInterceptorMod {
  
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
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Prop extends @testing-library/user-event.@testing-library/user-event/dist/types/document/interceptor.anyFunc ? std.Parameters<Prop> : Prop
    }}}
    */
  type ImplReturn[Prop] = Prop
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    Prop extends @testing-library/user-event.@testing-library/user-event/dist/types/document/interceptor.anyFunc ? std.Parameters<Prop> : [Prop]
    }}}
    */
  type Params[Prop] = js.Array[Prop]
  
  @js.native
  trait anyFunc extends StObject {
    
    def apply(a: Any*): Any = js.native
  }
}
