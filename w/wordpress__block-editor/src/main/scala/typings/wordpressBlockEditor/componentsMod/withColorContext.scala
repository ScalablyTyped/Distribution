package typings.wordpressBlockEditor.componentsMod

import typings.react.mod.ComponentClass
import typings.react.mod.ComponentState
import typings.react.mod.ComponentType
import typings.react.mod.FunctionComponent
import typings.std.Omit
import typings.wordpressBlockEditor.anon.PartialProps
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.colors
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.disableCustomColors
import typings.wordpressBlockEditor.wordpressBlockEditorStrings.hasColorsToChoose
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withColorContext {
  
  // prettier-ignore
  @scala.inline
  def apply[ProvidedProps /* <: PartialProps */, OwnProps /* <: js.Any */](component: ComponentClass[ProvidedProps & OwnProps, ComponentState]): ComponentType[
    (Omit[js.Any, colors | disableCustomColors | hasColorsToChoose]) & (Omit[ProvidedProps, hasColorsToChoose])
  ] = ^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[
    (Omit[js.Any, colors | disableCustomColors | hasColorsToChoose]) & (Omit[ProvidedProps, hasColorsToChoose])
  ]]
  @scala.inline
  def apply[ProvidedProps /* <: PartialProps */, OwnProps /* <: js.Any */](component: FunctionComponent[ProvidedProps & OwnProps]): ComponentType[
    (Omit[js.Any, colors | disableCustomColors | hasColorsToChoose]) & (Omit[ProvidedProps, hasColorsToChoose])
  ] = ^.asInstanceOf[js.Dynamic].apply(component.asInstanceOf[js.Any]).asInstanceOf[ComponentType[
    (Omit[js.Any, colors | disableCustomColors | hasColorsToChoose]) & (Omit[ProvidedProps, hasColorsToChoose])
  ]]
  
  @JSImport("@wordpress/block-editor/components", "withColorContext")
  @js.native
  val ^ : js.Any = js.native
}
