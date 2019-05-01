package typings
package tabrisLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tabrisMod {
  type ActionProperties = Partial[
    _ActionProperties, 
    tabrisLib.tabrisLibStrings.image | tabrisLib.tabrisLibStrings.placementPriority | tabrisLib.tabrisLibStrings.title | tabrisLib.tabrisLibStrings.win_symbol
  ]
  type ActionSheetProperties = Partial[
    _ActionSheetProperties, 
    tabrisLib.tabrisLibStrings.actions | tabrisLib.tabrisLibStrings.message | tabrisLib.tabrisLibStrings.title
  ]
  type ActivityIndicatorProperties = Partial[_ActivityIndicatorProperties, tabrisLib.tabrisLibStrings.tintColor]
  type AlertDialogProperties = Partial[
    _AlertDialogProperties, 
    tabrisLib.tabrisLibStrings.buttons | tabrisLib.tabrisLibStrings.message | tabrisLib.tabrisLibStrings.textInputs | tabrisLib.tabrisLibStrings.title
  ]
  type AppProperties = Partial[
    _AppProperties, 
    tabrisLib.tabrisLibStrings.pinnedCertificates | tabrisLib.tabrisLibStrings.trustedCertificates
  ]
  type ButtonProperties = Partial[
    _ButtonProperties, 
    tabrisLib.tabrisLibStrings.alignment | tabrisLib.tabrisLibStrings.image | tabrisLib.tabrisLibStrings.text | tabrisLib.tabrisLibStrings.textColor
  ]
  type CanvasEvents = CompositeEvents
  type CanvasProperties = Partial[_CanvasProperties, java.lang.String]
  type CheckBoxProperties = Partial[
    _CheckBoxProperties, 
    tabrisLib.tabrisLibStrings.checked | tabrisLib.tabrisLibStrings.checkedTintColor | tabrisLib.tabrisLibStrings.text | tabrisLib.tabrisLibStrings.textColor | tabrisLib.tabrisLibStrings.tintColor
  ]
  type CollectionViewProperties = Partial[
    _CollectionViewProperties, 
    tabrisLib.tabrisLibStrings.cellHeight | tabrisLib.tabrisLibStrings.cellType | tabrisLib.tabrisLibStrings.columnCount | tabrisLib.tabrisLibStrings.itemCount | tabrisLib.tabrisLibStrings.refreshEnabled | tabrisLib.tabrisLibStrings.refreshIndicator | tabrisLib.tabrisLibStrings.refreshMessage
  ]
  type CompositeProperties = Partial[_CompositeProperties, tabrisLib.tabrisLibStrings.padding]
  type DateDialogProperties = Partial[
    _DateDialogProperties, 
    tabrisLib.tabrisLibStrings.date | tabrisLib.tabrisLibStrings.maxDate | tabrisLib.tabrisLibStrings.minDate
  ]
  type DeviceProperties = Partial[_DeviceProperties, tabrisLib.tabrisLibStrings.platform]
  type DrawerProperties = Partial[
    _DrawerProperties, 
    tabrisLib.tabrisLibStrings.enabled | tabrisLib.tabrisLibStrings.win_displayMode | tabrisLib.tabrisLibStrings.win_targetView
  ]
  type FileSystemEvents = NativeObjectEvents
  type FileSystemProperties = Partial[_FileSystemProperties, java.lang.String]
  type Image = java.lang.String | tabrisLib.Anon_Height
  type ImageViewProperties = Partial[
    _ImageViewProperties, 
    tabrisLib.tabrisLibStrings.image | tabrisLib.tabrisLibStrings.maxZoomLevel | tabrisLib.tabrisLibStrings.minZoomLevel | tabrisLib.tabrisLibStrings.scaleMode | tabrisLib.tabrisLibStrings.tintColor | tabrisLib.tabrisLibStrings.zoomEnabled | tabrisLib.tabrisLibStrings.zoomLevel
  ]
  type InactivityTimerProperties = Partial[_InactivityTimerProperties, tabrisLib.tabrisLibStrings.delay]
  type NativeObjectProperties = Partial[_NativeObjectProperties, java.lang.String]
  type NavigationBarProperties = Partial[
    _NavigationBarProperties, 
    tabrisLib.tabrisLibStrings.background | tabrisLib.tabrisLibStrings.displayMode | tabrisLib.tabrisLibStrings.theme
  ]
  type NavigationViewProperties = Partial[
    _NavigationViewProperties, 
    tabrisLib.tabrisLibStrings.actionColor | tabrisLib.tabrisLibStrings.actionTextColor | tabrisLib.tabrisLibStrings.bottomToolbarHeight | tabrisLib.tabrisLibStrings.drawerActionVisible | tabrisLib.tabrisLibStrings.navigationAction | tabrisLib.tabrisLibStrings.pageAnimation | tabrisLib.tabrisLibStrings.titleTextColor | tabrisLib.tabrisLibStrings.toolbarColor | tabrisLib.tabrisLibStrings.toolbarVisible | tabrisLib.tabrisLibStrings.topToolbarHeight | tabrisLib.tabrisLibStrings.win_drawerActionBackground | tabrisLib.tabrisLibStrings.win_drawerActionTheme | tabrisLib.tabrisLibStrings.win_toolbarOverflowTheme | tabrisLib.tabrisLibStrings.win_toolbarTheme
  ]
  type PageProperties = Partial[
    _PageProperties, 
    tabrisLib.tabrisLibStrings.autoDispose | tabrisLib.tabrisLibStrings.image | tabrisLib.tabrisLibStrings.title
  ]
  type Partial[T, U /* <: java.lang.String */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in U ]:? T[P]}
    */ tabrisLib.tabrisLibStrings.Partial with T
  type PickerProperties = Partial[
    _PickerProperties, 
    tabrisLib.tabrisLibStrings.borderColor | tabrisLib.tabrisLibStrings.fillColor | tabrisLib.tabrisLibStrings.itemCount | tabrisLib.tabrisLibStrings.selectionIndex | tabrisLib.tabrisLibStrings.textColor
  ]
  type PopoverProperties = Partial[
    _PopoverProperties, 
    tabrisLib.tabrisLibStrings.anchor | tabrisLib.tabrisLibStrings.height | tabrisLib.tabrisLibStrings.width
  ]
  type PopupEvents = NativeObjectEvents
  type PopupProperties = Partial[_PopupProperties, java.lang.String]
  type PrinterEvents = NativeObjectEvents
  type PrinterProperties = Partial[_PrinterProperties, java.lang.String]
  type ProgressBarProperties = Partial[
    _ProgressBarProperties, 
    tabrisLib.tabrisLibStrings.maximum | tabrisLib.tabrisLibStrings.minimum | tabrisLib.tabrisLibStrings.selection | tabrisLib.tabrisLibStrings.state | tabrisLib.tabrisLibStrings.tintColor
  ]
  type Properties[T /* <: NativeObject */, U /* <: java.lang.String */] = /* import warning: ImportType.apply Failed type conversion: T[U] */ js.Any
  type RadioButtonProperties = Partial[
    _RadioButtonProperties, 
    tabrisLib.tabrisLibStrings.checked | tabrisLib.tabrisLibStrings.checkedTintColor | tabrisLib.tabrisLibStrings.text | tabrisLib.tabrisLibStrings.textColor | tabrisLib.tabrisLibStrings.tintColor
  ]
  type RefreshCompositeProperties = Partial[
    _RefreshCompositeProperties, 
    tabrisLib.tabrisLibStrings.refreshEnabled | tabrisLib.tabrisLibStrings.refreshIndicator | tabrisLib.tabrisLibStrings.refreshMessage
  ]
  type ScrollViewProperties = Partial[_ScrollViewProperties, tabrisLib.tabrisLibStrings.direction]
  type SearchActionProperties = Partial[
    _SearchActionProperties, 
    tabrisLib.tabrisLibStrings.message | tabrisLib.tabrisLibStrings.proposals | tabrisLib.tabrisLibStrings.text
  ]
  /**
    * An expression or a predicate function to select a set of widgets.
    */
  type Selector = java.lang.String | SelectorFunction
  type SelectorFunction = js.Function1[/* widget */ Widget, scala.Boolean]
  type SliderProperties = Partial[
    _SliderProperties, 
    tabrisLib.tabrisLibStrings.maximum | tabrisLib.tabrisLibStrings.minimum | tabrisLib.tabrisLibStrings.selection | tabrisLib.tabrisLibStrings.tintColor
  ]
  type StatusBarProperties = Partial[
    _StatusBarProperties, 
    tabrisLib.tabrisLibStrings.background | tabrisLib.tabrisLibStrings.displayMode | tabrisLib.tabrisLibStrings.theme
  ]
  type SwitchProperties = Partial[
    _SwitchProperties, 
    tabrisLib.tabrisLibStrings.checked | tabrisLib.tabrisLibStrings.thumbOffColor | tabrisLib.tabrisLibStrings.thumbOnColor | tabrisLib.tabrisLibStrings.trackOffColor | tabrisLib.tabrisLibStrings.trackOnColor
  ]
  type TabFolderProperties = Partial[
    _TabFolderProperties, 
    tabrisLib.tabrisLibStrings.paging | tabrisLib.tabrisLibStrings.selection | tabrisLib.tabrisLibStrings.tabBarLocation | tabrisLib.tabrisLibStrings.tabMode | tabrisLib.tabrisLibStrings.textColor | tabrisLib.tabrisLibStrings.win_tabBarTheme
  ]
  type TabProperties = Partial[
    _TabProperties, 
    tabrisLib.tabrisLibStrings.badge | tabrisLib.tabrisLibStrings.image | tabrisLib.tabrisLibStrings.selectedImage | tabrisLib.tabrisLibStrings.title
  ]
  type TextInputProperties = Partial[
    _TextInputProperties, 
    tabrisLib.tabrisLibStrings.alignment | tabrisLib.tabrisLibStrings.autoCapitalize | tabrisLib.tabrisLibStrings.autoCorrect | tabrisLib.tabrisLibStrings.borderColor | tabrisLib.tabrisLibStrings.cursorColor | tabrisLib.tabrisLibStrings.editable | tabrisLib.tabrisLibStrings.enterKeyType | tabrisLib.tabrisLibStrings.fillColor | tabrisLib.tabrisLibStrings.focused | tabrisLib.tabrisLibStrings.keepFocus | tabrisLib.tabrisLibStrings.keyboard | tabrisLib.tabrisLibStrings.message | tabrisLib.tabrisLibStrings.revealPassword | tabrisLib.tabrisLibStrings.selection | tabrisLib.tabrisLibStrings.text | tabrisLib.tabrisLibStrings.textColor | tabrisLib.tabrisLibStrings.`type`
  ]
  type TextViewProperties = Partial[
    _TextViewProperties, 
    tabrisLib.tabrisLibStrings.alignment | tabrisLib.tabrisLibStrings.lineSpacing | tabrisLib.tabrisLibStrings.markupEnabled | tabrisLib.tabrisLibStrings.maxLines | tabrisLib.tabrisLibStrings.selectable | tabrisLib.tabrisLibStrings.text | tabrisLib.tabrisLibStrings.textColor
  ]
  type TimeDialogProperties = Partial[_TimeDialogProperties, tabrisLib.tabrisLibStrings.date]
  type ToggleButtonProperties = Partial[
    _ToggleButtonProperties, 
    tabrisLib.tabrisLibStrings.alignment | tabrisLib.tabrisLibStrings.checked | tabrisLib.tabrisLibStrings.image | tabrisLib.tabrisLibStrings.text | tabrisLib.tabrisLibStrings.textColor
  ]
  type TypeScriptPropertiesKey = tabrisLib.tabrisLibStrings.tsProperties
  type UIEvents = CompositeEvents
  type UIProperties = Partial[
    _UIProperties, 
    tabrisLib.tabrisLibStrings.contentView | tabrisLib.tabrisLibStrings.drawer | tabrisLib.tabrisLibStrings.navigationBar | tabrisLib.tabrisLibStrings.statusBar
  ]
  type VideoProperties = Partial[
    _VideoProperties, 
    tabrisLib.tabrisLibStrings.autoPlay | tabrisLib.tabrisLibStrings.controlsVisible | tabrisLib.tabrisLibStrings.url
  ]
  type WebViewProperties = Partial[
    _WebViewProperties, 
    tabrisLib.tabrisLibStrings.html | tabrisLib.tabrisLibStrings.url
  ]
  type WidgetProperties = Partial[
    _WidgetProperties, 
    tabrisLib.tabrisLibStrings.background | tabrisLib.tabrisLibStrings.backgroundImage | tabrisLib.tabrisLibStrings.baseline | tabrisLib.tabrisLibStrings.bottom | tabrisLib.tabrisLibStrings.centerX | tabrisLib.tabrisLibStrings.centerY | tabrisLib.tabrisLibStrings.`class` | tabrisLib.tabrisLibStrings.classList | tabrisLib.tabrisLibStrings.cornerRadius | tabrisLib.tabrisLibStrings.elevation | tabrisLib.tabrisLibStrings.enabled | tabrisLib.tabrisLibStrings.font | tabrisLib.tabrisLibStrings.height | tabrisLib.tabrisLibStrings.highlightOnTouch | tabrisLib.tabrisLibStrings.id | tabrisLib.tabrisLibStrings.layoutData | tabrisLib.tabrisLibStrings.left | tabrisLib.tabrisLibStrings.opacity | tabrisLib.tabrisLibStrings.right | tabrisLib.tabrisLibStrings.top | tabrisLib.tabrisLibStrings.transform | tabrisLib.tabrisLibStrings.visible | tabrisLib.tabrisLibStrings.width | tabrisLib.tabrisLibStrings.win_theme
  ]
  // Canvas
  type _CanvasProperties = _CompositeProperties
  // FileSystem
  type _FileSystemProperties = _NativeObjectProperties
  // Popup
  type _PopupProperties = _NativeObjectProperties
  // Printer
  type _PrinterProperties = _NativeObjectProperties
}
