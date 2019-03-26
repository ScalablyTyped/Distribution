package typings

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tabrisLib {
  type ActionProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _ActionProperties */ js.Any, 
    java.lang.String
  ]
  type ActionSheetProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _ActionSheetProperties */ js.Any, 
    java.lang.String
  ]
  type ActivityIndicatorProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _ActivityIndicatorProperties */ js.Any, 
    java.lang.String
  ]
  type AlertDialogProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _AlertDialogProperties */ js.Any, 
    java.lang.String
  ]
  type AppProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _AppProperties */ js.Any, 
    java.lang.String
  ]
  // TODO: enable when Blob support is added
  // declare type BodyInit = Blob | FormData | string;
  type BodyInit = java.lang.String
  type ButtonProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _ButtonProperties */ js.Any, 
    java.lang.String
  ]
  type CanvasProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _CanvasProperties */ js.Any, 
    java.lang.String
  ]
  type CheckBoxProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _CheckBoxProperties */ js.Any, 
    java.lang.String
  ]
  type CollectionViewProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _CollectionViewProperties */ js.Any, 
    java.lang.String
  ]
  /**
    * Colors are specified as strings using one of the following formats:
    *
    * - **"#xxxxxx"**
    * - **"#xxx"**
    * - **"#xxxxxxxx"**
    * - **"#xxxx"**
    * - **"rgb(r, g, b)"** with **r**, **g** and **b** being numbers in the range 0..255.
    * - **"rgba(r, g, b, a)"** with **a** being a number in the range 0..1.
    * - a color name from the CSS3 specification.
    * - **"transparent"** sets a fully transparent color. This is a shortcut for **"rgba(0, 0, 0, 0)"**.
    * - **"initial"** resets the color to its (platform-dependent) default.
    */
  type Color = java.lang.String
  type CompositeProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _CompositeProperties */ js.Any, 
    java.lang.String
  ]
  type CustomEvent = Event
  type DateDialogProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _DateDialogProperties */ js.Any, 
    java.lang.String
  ]
  type DeviceProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _DeviceProperties */ js.Any, 
    java.lang.String
  ]
  type DrawerProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _DrawerProperties */ js.Any, 
    java.lang.String
  ]
  type EventListener = js.Function1[/* evt */ Event, scala.Unit]
  type FileSystemProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _FileSystemProperties */ js.Any, 
    java.lang.String
  ]
  /**
    * Fonts are specified as strings using the shorthand syntax known from CSS, specifically **"[font-style] [font-weight] font-size [font-family[, font-family]*]"**. The font family may be omitted, in this case the default system font will be used. Generic font families supported across all platforms are **"serif"**, **"sans-serif"**, **"condensed"** and **"monospace"**. Supported font weights are **"light"**, **"thin"**, **"normal"**, **"medium"**, **"bold"** and **"black"**. The value **"initial"** represents the platform default.
    */
  type Font = java.lang.String
  type HeaderInit = Headers | js.Array[java.lang.String]
  type Image = (java.lang.String | Anon_Height) with (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias tabris.Image */ js.Object)
  type ImageViewProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _ImageViewProperties */ js.Any, 
    java.lang.String
  ]
  type InactivityTimerProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _InactivityTimerProperties */ js.Any, 
    java.lang.String
  ]
  type NativeObjectProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _NativeObjectProperties */ js.Any, 
    java.lang.String
  ]
  type NavigationBarProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _NavigationBarProperties */ js.Any, 
    java.lang.String
  ]
  type NavigationViewProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _NavigationViewProperties */ js.Any, 
    java.lang.String
  ]
  type PageProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _PageProperties */ js.Any, 
    java.lang.String
  ]
  type Partial[T, U /* <: java.lang.String */] = /* import warning: ImportType.apply c Unsupported type mapping: 
  {[ P in U ]:? T[P]}
    */ tabrisLib.tabrisLibStrings.Partial with T
  type PickerProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _PickerProperties */ js.Any, 
    java.lang.String
  ]
  type PopoverProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _PopoverProperties */ js.Any, 
    java.lang.String
  ]
  type PopupProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _PopupProperties */ js.Any, 
    java.lang.String
  ]
  type PrinterProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _PrinterProperties */ js.Any, 
    java.lang.String
  ]
  type ProgressBarProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _ProgressBarProperties */ js.Any, 
    java.lang.String
  ]
  type Properties[T /* <: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify NativeObject */ js.Any */, U /* <: java.lang.String */] = /* import warning: ImportType.apply Failed type conversion: T[U] */ js.Any
  type RadioButtonProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _RadioButtonProperties */ js.Any, 
    java.lang.String
  ]
  type RefreshCompositeProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _RefreshCompositeProperties */ js.Any, 
    java.lang.String
  ]
  type RequestInfo = Request | java.lang.String
  type ScrollViewProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _ScrollViewProperties */ js.Any, 
    java.lang.String
  ]
  type SearchActionProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _SearchActionProperties */ js.Any, 
    java.lang.String
  ]
  /**
    * An expression or a predicate function to select a set of widgets.
    */
  type Selector = (java.lang.String | SelectorFunction) with (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias tabris.Selector */ js.Object)
  type SelectorFunction = js.Function1[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify Widget */ /* widget */ js.Any, 
    scala.Boolean
  ]
  type SliderProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _SliderProperties */ js.Any, 
    java.lang.String
  ]
  type StatusBarProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _StatusBarProperties */ js.Any, 
    java.lang.String
  ]
  type SwitchProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _SwitchProperties */ js.Any, 
    java.lang.String
  ]
  type TabFolderProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _TabFolderProperties */ js.Any, 
    java.lang.String
  ]
  type TabProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _TabProperties */ js.Any, 
    java.lang.String
  ]
  type TextInputProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _TextInputProperties */ js.Any, 
    java.lang.String
  ]
  type TextViewProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _TextViewProperties */ js.Any, 
    java.lang.String
  ]
  type TimeDialogProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _TimeDialogProperties */ js.Any, 
    java.lang.String
  ]
  type ToggleButtonProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _ToggleButtonProperties */ js.Any, 
    java.lang.String
  ]
  type TypeScriptPropertiesKey = tabrisLib.tabrisLibStrings.tsProperties
  type UIProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _UIProperties */ js.Any, 
    java.lang.String
  ]
  type VideoProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _VideoProperties */ js.Any, 
    java.lang.String
  ]
  type WebViewProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _WebViewProperties */ js.Any, 
    java.lang.String
  ]
  type WidgetProperties = Partial[
    /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify _WidgetProperties */ js.Any, 
    java.lang.String
  ]
  /**
    * A positive float, or 0, representing device independent pixels.
    */
  type dimension = scala.Double
  /**
    * Distance to a parent's or sibling's opposing edge in one of these formats:
    * - **offset** the distance from the parent's opposing edge in device independent pixels
    * - **percentage** the distance from the parent's opposing edge in percent of the parent's width
    * - **Widget** attach this edge to the given siblings's opposing edge
    * - **"selector"**
    * - **"prev()"** Same as above, but as space-separated string list instead of array
    * - **"selector offset"**
    * - **"prev() offset"**
    * - **[Widget, offset]** the distance from the given widget's opposing edge in pixel
    * - **"Widget, offset"**Same as above, but as space-separated string list instead of array.
    * - **[percentage, offset]** the distance from the parent's opposing edge in percent of the parent's width plus a fixed offset in pixels
    * - **"percentage offset"** Same as above, but as space-separated string list instead of array
    * - **[selector, offset]**
    * - **["prev()", offset]**
    */
  type margin = js.Any
  /**
    * A positive or negative float, or 0, representing device independent pixels.
    */
  type offset = scala.Double
}
