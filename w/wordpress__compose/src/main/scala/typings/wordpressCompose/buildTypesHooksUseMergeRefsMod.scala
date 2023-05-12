package typings.wordpressCompose

import typings.react.mod.Ref
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesHooksUseMergeRefsMod {
  
  @JSImport("@wordpress/compose/build-types/hooks/use-merge-refs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[TRef /* <: Ref[Any] */](refs: js.Array[TRef]): js.Function1[/* instance */ TypeFromRef[TRef] | Null, Unit] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(refs.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* instance */ TypeFromRef[TRef] | Null, Unit]]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    T extends react.react.Ref<infer R> ? R : never
    }}}
    */
  @js.native
  trait TypeFromRef[T] extends StObject
}
