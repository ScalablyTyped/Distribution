package typings.styledDashComponents.styledDashComponentsMod

import typings.react.reactMod.WeakValidationMap
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// abuse Pick to strip the call signature from ForwardRefExoticComponent
/* Inlined std.Pick<react.react.ForwardRefExoticComponent<P>, keyof react.react.ForwardRefExoticComponent<any>> */
@js.native
trait ForwardRefExoticBase[P] extends js.Object {
  @JSName("$$typeof")
  var $$typeof: js.Symbol = js.native
  var defaultProps: js.UndefOr[Partial[typings.styledDashComponents.styledDashComponentsStrings.defaultProps]] = js.native
  var displayName: js.UndefOr[String] = js.native
  var propTypes: js.UndefOr[
    WeakValidationMap[typings.styledDashComponents.styledDashComponentsStrings.propTypes]
  ] = js.native
}

