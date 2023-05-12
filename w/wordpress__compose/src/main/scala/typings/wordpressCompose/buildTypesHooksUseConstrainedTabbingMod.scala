package typings.wordpressCompose

import typings.react.mod.RefCallback
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesHooksUseConstrainedTabbingMod {
  
  @JSImport("@wordpress/compose/build-types/hooks/use-constrained-tabbing", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * In Dialogs/modals, the tabbing must be constrained to the content of
    * the wrapper element. This hook adds the behavior to the returned ref.
    *
    * @return {import('react').RefCallback<Element>} Element Ref.
    *
    * @example
    * ```js
    * import { useConstrainedTabbing } from '@wordpress/compose';
    *
    * const ConstrainedTabbingExample = () => {
    *     const constrainedTabbingRef = useConstrainedTabbing()
    *     return (
    *         <div ref={ constrainedTabbingRef }>
    *             <Button />
    *             <Button />
    *         </div>
    *     );
    * }
    * ```
    */
  inline def default(): RefCallback[Element] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[RefCallback[Element]]
}
