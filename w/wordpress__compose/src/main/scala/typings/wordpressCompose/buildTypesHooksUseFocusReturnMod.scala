package typings.wordpressCompose

import typings.react.mod.RefCallback
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesHooksUseFocusReturnMod {
  
  @JSImport("@wordpress/compose/build-types/hooks/use-focus-return", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * When opening modals/sidebars/dialogs, the focus
    * must move to the opened area and return to the
    * previously focused element when closed.
    * The current hook implements the returning behavior.
    *
    * @param {() => void} [onFocusReturn] Overrides the default return behavior.
    * @return {import('react').RefCallback<HTMLElement>} Element Ref.
    *
    * @example
    * ```js
    * import { useFocusReturn } from '@wordpress/compose';
    *
    * const WithFocusReturn = () => {
    *     const ref = useFocusReturn()
    *     return (
    *         <div ref={ ref }>
    *             <Button />
    *             <Button />
    *         </div>
    *     );
    * }
    * ```
    */
  inline def default(): RefCallback[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[RefCallback[HTMLElement]]
  inline def default(onFocusReturn: js.Function0[Unit]): RefCallback[HTMLElement] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(onFocusReturn.asInstanceOf[js.Any]).asInstanceOf[RefCallback[HTMLElement]]
}
