package typings.tabris.global.tabris

import typings.std.Partial
import typings.std.Pick
import typings.tabris.anon.OmitActionsetAbsoluteBounds
import typings.tabris.anon.OmitActivityIndicatorsetAbsoluteBounds
import typings.tabris.anon.OmitButtonsetAbsoluteBounds
import typings.tabris.anon.OmitCameraViewsetAbsoluteBounds
import typings.tabris.anon.OmitCanvassetAbsoluteBounds
import typings.tabris.anon.OmitCheckBoxsetAbsoluteBounds
import typings.tabris.anon.OmitCompositeWidgetsetAbsoluteBounds
import typings.tabris.anon.OmitImageViewsetAbsoluteBounds
import typings.tabris.anon.OmitNavigationViewPageActAbsoluteBounds
import typings.tabris.anon.OmitOmitVideospeedpositioAppendTo
import typings.tabris.anon.OmitOmitWebViewcanGoBackcAppendTo
import typings.tabris.anon.OmitPagesetAbsoluteBounds
import typings.tabris.anon.OmitPdfViewsetAbsoluteBounds
import typings.tabris.anon.OmitPickersetAbsoluteBounds
import typings.tabris.anon.OmitProgressBarsetAbsoluteBounds
import typings.tabris.anon.OmitRadioButtonsetAbsoluteBounds
import typings.tabris.anon.OmitRefreshCompositesetAbsoluteBounds
import typings.tabris.anon.OmitRowsetAbsoluteBounds
import typings.tabris.anon.OmitScrollViewsetAbsoluteBounds
import typings.tabris.anon.OmitSearchActionsetAbsoluteBounds
import typings.tabris.anon.OmitSlidersetAbsoluteBounds
import typings.tabris.anon.OmitStacksetAbsoluteBounds
import typings.tabris.anon.OmitSwitchsetAbsoluteBounds
import typings.tabris.anon.OmitTabFolderTabsetAbsoluteBounds
import typings.tabris.anon.OmitTabsetAbsoluteBounds
import typings.tabris.anon.OmitTextInputsetAbsoluteBounds
import typings.tabris.anon.OmitTextViewsetAbsoluteBounds
import typings.tabris.anon.OmitToggleButtonsetAbsoluteBounds
import typings.tabris.anon.OmitVideospeedpositiondurAnimate
import typings.tabris.anon.OmitWebViewcanGoBackcanGoAnimate
import typings.tabris.anon.PartialPickPickeritemText
import typings.tabris.mod.Omit
import typings.tabris.mod.Properties
import typings.tabris.tabrisStrings.cellHeight
import typings.tabris.tabrisStrings.cellType
import typings.tabris.tabrisStrings.createCell
import typings.tabris.tabrisStrings.set
import typings.tabris.tabrisStrings.updateCell
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object widgets {
  
  @JSGlobal("tabris.widgets.Action")
  @js.native
  class Action ()
    extends typings.tabris.mod.widgets.Action {
    def this(properties: Properties[typings.tabris.mod.widgets.Action, OmitActionsetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.ActivityIndicator")
  @js.native
  class ActivityIndicator ()
    extends typings.tabris.mod.widgets.ActivityIndicator {
    def this(properties: Properties[
            typings.tabris.mod.widgets.ActivityIndicator, 
            OmitActivityIndicatorsetAbsoluteBounds
          ]) = this()
  }
  
  @JSGlobal("tabris.widgets.Button")
  @js.native
  class Button ()
    extends typings.tabris.mod.widgets.Button {
    def this(properties: Properties[typings.tabris.mod.widgets.Button, OmitButtonsetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.CameraView")
  @js.native
  class CameraView ()
    extends typings.tabris.mod.widgets.CameraView {
    def this(properties: Properties[typings.tabris.mod.widgets.CameraView, OmitCameraViewsetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.Canvas")
  @js.native
  class Canvas ()
    extends typings.tabris.mod.widgets.Canvas {
    def this(properties: Properties[typings.tabris.mod.widgets.Canvas, OmitCanvassetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.CheckBox")
  @js.native
  class CheckBox ()
    extends typings.tabris.mod.widgets.CheckBox {
    def this(properties: Properties[typings.tabris.mod.widgets.CheckBox, OmitCheckBoxsetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.CollectionView")
  @js.native
  class CollectionView[CellWidgetType /* <: typings.tabris.mod.Widget */] ()
    extends typings.tabris.mod.widgets.CollectionView[CellWidgetType] {
    def this(properties: (Properties[
            Omit[
              typings.tabris.mod.widgets.CollectionView[CellWidgetType], 
              typings.tabris.tabrisStrings.firstVisibleIndex | typings.tabris.tabrisStrings.lastVisibleIndex
            ], 
            Omit[
              Omit[
                typings.tabris.mod.widgets.CollectionView[CellWidgetType], 
                typings.tabris.tabrisStrings.firstVisibleIndex | typings.tabris.tabrisStrings.lastVisibleIndex
              ], 
              set
            ]
          ]) & (Partial[
            Pick[
              typings.tabris.mod.widgets.CollectionView[CellWidgetType], 
              cellHeight | cellType | createCell | updateCell
            ]
          ])) = this()
  }
  
  @JSGlobal("tabris.widgets.Composite")
  @js.native
  class Composite[ChildType /* <: typings.tabris.mod.Widget */] ()
    extends typings.tabris.mod.widgets.Composite[ChildType] {
    def this(properties: Properties[
            typings.tabris.mod.widgets.Composite[typings.tabris.mod.Widget], 
            OmitCompositeWidgetsetAbsoluteBounds[ChildType]
          ]) = this()
  }
  
  @JSGlobal("tabris.widgets.ImageView")
  @js.native
  class ImageView ()
    extends typings.tabris.mod.widgets.ImageView {
    def this(properties: Properties[typings.tabris.mod.widgets.ImageView, OmitImageViewsetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.NavigationView")
  @js.native
  class NavigationView[PageType /* <: typings.tabris.mod.Page */, ActionType /* <: typings.tabris.mod.Action */] ()
    extends typings.tabris.mod.widgets.NavigationView[PageType, ActionType] {
    def this(properties: Properties[
            typings.tabris.mod.widgets.NavigationView[typings.tabris.mod.Page, typings.tabris.mod.Action], 
            OmitNavigationViewPageActAbsoluteBounds[PageType, ActionType]
          ]) = this()
  }
  
  @JSGlobal("tabris.widgets.Page")
  @js.native
  class Page ()
    extends typings.tabris.mod.widgets.Page {
    def this(properties: Properties[typings.tabris.mod.widgets.Page, OmitPagesetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.PdfView")
  @js.native
  class PdfView ()
    extends typings.tabris.mod.widgets.PdfView {
    def this(properties: Properties[typings.tabris.mod.widgets.PdfView, OmitPdfViewsetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.Picker")
  @js.native
  class Picker ()
    extends typings.tabris.mod.widgets.Picker {
    def this(properties: (Properties[typings.tabris.mod.widgets.Picker, OmitPickersetAbsoluteBounds]) & PartialPickPickeritemText) = this()
  }
  
  @JSGlobal("tabris.widgets.ProgressBar")
  @js.native
  class ProgressBar ()
    extends typings.tabris.mod.widgets.ProgressBar {
    def this(properties: Properties[typings.tabris.mod.widgets.ProgressBar, OmitProgressBarsetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.RadioButton")
  @js.native
  class RadioButton ()
    extends typings.tabris.mod.widgets.RadioButton {
    def this(properties: Properties[typings.tabris.mod.widgets.RadioButton, OmitRadioButtonsetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.RefreshComposite")
  @js.native
  class RefreshComposite ()
    extends typings.tabris.mod.widgets.RefreshComposite {
    def this(properties: Properties[typings.tabris.mod.widgets.RefreshComposite, OmitRefreshCompositesetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.Row")
  @js.native
  class Row ()
    extends typings.tabris.mod.widgets.Row {
    def this(properties: Properties[typings.tabris.mod.widgets.Row, OmitRowsetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.ScrollView")
  @js.native
  class ScrollView ()
    extends typings.tabris.mod.widgets.ScrollView {
    def this(properties: Properties[typings.tabris.mod.widgets.ScrollView, OmitScrollViewsetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.SearchAction")
  @js.native
  class SearchAction ()
    extends typings.tabris.mod.widgets.SearchAction {
    def this(properties: Properties[typings.tabris.mod.widgets.SearchAction, OmitSearchActionsetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.Slider")
  @js.native
  class Slider ()
    extends typings.tabris.mod.widgets.Slider {
    def this(properties: Properties[typings.tabris.mod.widgets.Slider, OmitSlidersetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.Stack")
  @js.native
  class Stack ()
    extends typings.tabris.mod.widgets.Stack {
    def this(properties: Properties[typings.tabris.mod.widgets.Stack, OmitStacksetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.Switch")
  @js.native
  class Switch ()
    extends typings.tabris.mod.widgets.Switch {
    def this(properties: Properties[typings.tabris.mod.widgets.Switch, OmitSwitchsetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.Tab")
  @js.native
  class Tab ()
    extends typings.tabris.mod.widgets.Tab {
    def this(properties: Properties[typings.tabris.mod.widgets.Tab, OmitTabsetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.TabFolder")
  @js.native
  class TabFolder[TabType /* <: typings.tabris.mod.Tab */] ()
    extends typings.tabris.mod.widgets.TabFolder[TabType] {
    def this(properties: Properties[
            typings.tabris.mod.widgets.TabFolder[typings.tabris.mod.Tab], 
            OmitTabFolderTabsetAbsoluteBounds[TabType]
          ]) = this()
  }
  
  @JSGlobal("tabris.widgets.TextInput")
  @js.native
  class TextInput ()
    extends typings.tabris.mod.widgets.TextInput {
    def this(properties: Properties[typings.tabris.mod.widgets.TextInput, OmitTextInputsetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.TextView")
  @js.native
  class TextView ()
    extends typings.tabris.mod.widgets.TextView {
    def this(properties: Properties[typings.tabris.mod.widgets.TextView, OmitTextViewsetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.ToggleButton")
  @js.native
  class ToggleButton ()
    extends typings.tabris.mod.widgets.ToggleButton {
    def this(properties: Properties[typings.tabris.mod.widgets.ToggleButton, OmitToggleButtonsetAbsoluteBounds]) = this()
  }
  
  @JSGlobal("tabris.widgets.Video")
  @js.native
  class Video ()
    extends typings.tabris.mod.widgets.Video {
    def this(properties: Properties[OmitVideospeedpositiondurAnimate, OmitOmitVideospeedpositioAppendTo]) = this()
  }
  
  @JSGlobal("tabris.widgets.WebView")
  @js.native
  class WebView ()
    extends typings.tabris.mod.widgets.WebView {
    def this(properties: Properties[OmitWebViewcanGoBackcanGoAnimate, OmitOmitWebViewcanGoBackcAppendTo]) = this()
  }
}
