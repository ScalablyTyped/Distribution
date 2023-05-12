package typings.wordpressCompose

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buildTypesHooksUseWarnOnChangeMod {
  
  @JSImport("@wordpress/compose/build-types/hooks/use-warn-on-change", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /**
    * Hook that performs a shallow comparison between the preview value of an object
    * and the new one, if there's a difference, it prints it to the console.
    * this is useful in performance related work, to check why a component re-renders.
    *
    *  @example
    *
    * ```jsx
    * function MyComponent(props) {
    *    useWarnOnChange(props);
    *
    *    return "Something";
    * }
    * ```
    *
    * @param {object} object Object which changes to compare.
    * @param {string} prefix Just a prefix to show when console logging.
    */
  inline def default(`object`: js.Object): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(`object`.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def default(`object`: js.Object, prefix: String): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(`object`.asInstanceOf[js.Any], prefix.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
