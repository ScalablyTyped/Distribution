package typings.useGestureReact

import typings.react.mod.DOMAttributes
import typings.std.EventTarget
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distDeclarationsSrcTypesMod {
  
  /** NOTE: Mapped type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/mapped-types.html for an intro.
    * This translation is imprecise and ignores the effect of the type mapping. 
    * TS definition: {{{
    {[ Key in keyof / * import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify DOMHandlers * / any ]: react.react.DOMAttributes<std.EventTarget>[Key]}
    }}}
    */
  type ReactDOMAttributes = DOMAttributes[EventTarget]
}
