package typings.wordpressBlockEditor.withColorContextMod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.std.Omit
import typings.wordpressBlockEditor.anon.PartialProps
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.colors
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.disableCustomColors
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.hasColorsToChoose
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@wordpress/block-editor/components/color-palette/with-color-context", JSImport.Default)
@js.native
object default extends js.Object {
  // prettier-ignore
  def apply[ProvidedProps /* <: PartialProps */, OwnProps /* <: js.Any */](component: ComponentClass[ProvidedProps with OwnProps, ComponentState]): ComponentType[
    (Omit[_, colors | disableCustomColors | hasColorsToChoose]) with (Omit[ProvidedProps, hasColorsToChoose])
  ] = js.native
  def apply[ProvidedProps /* <: PartialProps */, OwnProps /* <: js.Any */](component: FunctionComponent[ProvidedProps with OwnProps]): ComponentType[
    (Omit[_, colors | disableCustomColors | hasColorsToChoose]) with (Omit[ProvidedProps, hasColorsToChoose])
  ] = js.native
}

