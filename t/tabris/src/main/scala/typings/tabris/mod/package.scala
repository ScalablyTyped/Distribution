package typings.tabris.mod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Exclude
import typings.std.InstanceType
import typings.std.Number
import typings.std.Partial
import typings.std.Pick
import typings.tabris.Crypto
import typings.tabris.RequestInit
import typings.tabris.anon.ApplyChildren
import typings.tabris.anon.Attribute
import typings.tabris.anon.Bottom
import typings.tabris.anon.Children
import typings.tabris.anon.Cid
import typings.tabris.anon.CidData
import typings.tabris.anon.Data
import typings.tabris.anon.Family
import typings.tabris.anon.Name
import typings.tabris.anon.Unsubscribe
import typings.tabris.anon.`0`
import typings.tabris.anon.`5`
import typings.tabris.mod.^
import typings.tabris.tabrisStrings.`type`
import typings.tabris.tabrisStrings.constructor
import typings.tabris.tabrisStrings.jsxAttributes
import typings.tabris.tabrisStrings.set
import typings.tabris.tabrisStrings.target
import typings.tabris.tabrisStrings.timeStamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Action: ActionFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Action").asInstanceOf[ActionFactory]
type Action = typings.tabris.mod.widgets.Action

inline def ActivityIndicator: ActivityIndicatorFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("ActivityIndicator").asInstanceOf[ActivityIndicatorFactory]
type ActivityIndicator = typings.tabris.mod.widgets.ActivityIndicator

inline def Apply[WidgetConstructor /* <: BaseConstructor[Widget[Any]] */](attr: ApplyAttributes[WidgetConstructor]): typings.tabris.anon.Apply = ^.asInstanceOf[js.Dynamic].applyDynamic("Apply")(attr.asInstanceOf[js.Any]).asInstanceOf[typings.tabris.anon.Apply]

inline def Button: ButtonFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Button").asInstanceOf[ButtonFactory]
type Button = typings.tabris.mod.widgets.Button

inline def CameraView: CameraViewFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("CameraView").asInstanceOf[CameraViewFactory]
type CameraView = typings.tabris.mod.widgets.CameraView

inline def Canvas: CanvasFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Canvas").asInstanceOf[CanvasFactory]
type Canvas = typings.tabris.mod.widgets.Canvas

inline def CheckBox: CheckBoxFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("CheckBox").asInstanceOf[CheckBoxFactory]
type CheckBox = typings.tabris.mod.widgets.CheckBox

inline def CollectionView: CollectionViewFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("CollectionView").asInstanceOf[CollectionViewFactory]
type CollectionView[CellWidgetType /* <: Widget[Any] */] = typings.tabris.mod.widgets.CollectionView[CellWidgetType]

inline def Composite: CompositeFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Composite").asInstanceOf[CompositeFactory]
type Composite[ChildType /* <: AnyWidget */] = typings.tabris.mod.widgets.Composite[ChildType]

inline def ImageView: ImageViewFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("ImageView").asInstanceOf[ImageViewFactory]
type ImageView = typings.tabris.mod.widgets.ImageView

inline def NavigationView: NavigationViewFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("NavigationView").asInstanceOf[NavigationViewFactory]
type NavigationView[PageType /* <: typings.tabris.mod.Page */, ActionType /* <: typings.tabris.mod.Action */] = typings.tabris.mod.widgets.NavigationView[PageType, ActionType]

inline def ObservableData: ObservableDataFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("ObservableData").asInstanceOf[ObservableDataFactory]
type ObservableData = typings.tabris.mod.widgets.ObservableData

inline def Page: PageFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Page").asInstanceOf[PageFactory]
type Page = typings.tabris.mod.widgets.Page

inline def PdfView: PdfViewFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("PdfView").asInstanceOf[PdfViewFactory]
type PdfView = typings.tabris.mod.widgets.PdfView

inline def Picker: PickerFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Picker").asInstanceOf[PickerFactory]
type Picker = typings.tabris.mod.widgets.Picker

inline def ProgressBar: ProgressBarFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("ProgressBar").asInstanceOf[ProgressBarFactory]
type ProgressBar = typings.tabris.mod.widgets.ProgressBar

inline def RadioButton: RadioButtonFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("RadioButton").asInstanceOf[RadioButtonFactory]
type RadioButton = typings.tabris.mod.widgets.RadioButton

inline def RefreshComposite: RefreshCompositeFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("RefreshComposite").asInstanceOf[RefreshCompositeFactory]
type RefreshComposite = typings.tabris.mod.widgets.RefreshComposite

inline def Row: RowFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Row").asInstanceOf[RowFactory]
type Row = typings.tabris.mod.widgets.Row

inline def ScrollView: ScrollViewFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("ScrollView").asInstanceOf[ScrollViewFactory]
type ScrollView = typings.tabris.mod.widgets.ScrollView

inline def SearchAction: SearchActionFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("SearchAction").asInstanceOf[SearchActionFactory]
type SearchAction = typings.tabris.mod.widgets.SearchAction

inline def Set[TargetConstructor /* <: BaseConstructor[NativeObject] */, ResultType, AttrName /* <: /* keyof ResultType */ String */](attr: Attribute[TargetConstructor, AttrName, ResultType]): ResultType = ^.asInstanceOf[js.Dynamic].applyDynamic("Set")(attr.asInstanceOf[js.Any]).asInstanceOf[ResultType]

inline def Set_prototype[WidgetConstructor /* <: BaseConstructor[Widget[Any]] */](
  target: WidgetConstructor,
  attributes: Attributes[
  /* import warning: importer.ImportType#apply Failed type conversion: WidgetConstructor['prototype'] */ js.Any, 
  Any
]
): Attributes[
/* import warning: importer.ImportType#apply Failed type conversion: WidgetConstructor['prototype'] */ js.Any, 
Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Set")(target.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Attributes[
/* import warning: importer.ImportType#apply Failed type conversion: WidgetConstructor['prototype'] */ js.Any, 
Any]]
inline def Set_prototype[WidgetConstructor /* <: BaseConstructor[Widget[Any]] */](
  target: WidgetConstructor,
  selector: SelectorString,
  attributes: Attributes[
  /* import warning: importer.ImportType#apply Failed type conversion: WidgetConstructor['prototype'] */ js.Any, 
  Any
]
): RuleSet[Widget[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Set")(target.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[RuleSet[Widget[Any]]]

inline def Setter[TargetConstructor /* <: BaseConstructor[NativeObject] */, ResultType, AttrName /* <: /* keyof ResultType */ String */](attr: Attribute[TargetConstructor, AttrName, ResultType]): ResultType = ^.asInstanceOf[js.Dynamic].applyDynamic("Setter")(attr.asInstanceOf[js.Any]).asInstanceOf[ResultType]

inline def Setter_prototype[WidgetConstructor /* <: BaseConstructor[Widget[Any]] */](
  target: WidgetConstructor,
  attributes: Attributes[
  /* import warning: importer.ImportType#apply Failed type conversion: WidgetConstructor['prototype'] */ js.Any, 
  Any
]
): Attributes[
/* import warning: importer.ImportType#apply Failed type conversion: WidgetConstructor['prototype'] */ js.Any, 
Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("Setter")(target.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[Attributes[
/* import warning: importer.ImportType#apply Failed type conversion: WidgetConstructor['prototype'] */ js.Any, 
Any]]
inline def Setter_prototype[WidgetConstructor /* <: BaseConstructor[Widget[Any]] */](
  target: WidgetConstructor,
  selector: SelectorString,
  attributes: Attributes[
  /* import warning: importer.ImportType#apply Failed type conversion: WidgetConstructor['prototype'] */ js.Any, 
  Any
]
): RuleSet[Widget[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Setter")(target.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[RuleSet[Widget[Any]]]

inline def Slider: SliderFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Slider").asInstanceOf[SliderFactory]
type Slider = typings.tabris.mod.widgets.Slider

inline def Stack: StackFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Stack").asInstanceOf[StackFactory]
type Stack = typings.tabris.mod.widgets.Stack

inline def Switch: SwitchFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Switch").asInstanceOf[SwitchFactory]
type Switch = typings.tabris.mod.widgets.Switch

inline def Tab: TabFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Tab").asInstanceOf[TabFactory]
type Tab = typings.tabris.mod.widgets.Tab

inline def TabFolder: TabFolderFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("TabFolder").asInstanceOf[TabFolderFactory]
type TabFolder[TabType /* <: typings.tabris.mod.Tab */] = typings.tabris.mod.widgets.TabFolder[TabType]

inline def TextInput: TextInputFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("TextInput").asInstanceOf[TextInputFactory]
type TextInput = typings.tabris.mod.widgets.TextInput

inline def TextView: TextViewFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("TextView").asInstanceOf[TextViewFactory]
type TextView = typings.tabris.mod.widgets.TextView

inline def ToggleButton: ToggleButtonFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("ToggleButton").asInstanceOf[ToggleButtonFactory]
type ToggleButton = typings.tabris.mod.widgets.ToggleButton

inline def Video: VideoFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Video").asInstanceOf[VideoFactory]
type Video = typings.tabris.mod.widgets.Video

inline def WebView: WebViewFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("WebView").asInstanceOf[WebViewFactory]
type WebView = typings.tabris.mod.widgets.WebView

inline def _empty(attributes: Null, children: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
inline def _empty(attributes: Null, children: js.Array[Null | String | Double | Boolean]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
inline def _empty(attributes: Null, children: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
inline def _empty(attributes: Null, children: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
inline def _empty(attributes: Null, children: JSXChildren[Widget[Any]]): WidgetCollection[Widget[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[WidgetCollection[Widget[Any]]]
/**
  * A JSX stateless functional component that groups all given widgets in a WidgetCollection
  * @param attributes This parameter needs to be null since <$> does not support any attributes
  * @param children The widgets to be included in the resulting WidgetCollection instance.
  */
/* was `typeof $` */
inline def _empty(attributes: Children, children: JSXChildren[Widget[Any]]): WidgetCollection[Widget[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[WidgetCollection[Widget[Any]]]
/**
  * A JSX stateless functional component that joins any given content in to a single string.
  * @param attributes This parameter needs to be null since <$> does not support any attributes.
  * @param children The content of the resulting string.
  */
/* was `typeof $` */
inline def _empty(attributes: `0`, children: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
inline def _empty(attributes: `0`, children: js.Array[Null | String | Double | Boolean]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
inline def _empty(attributes: `0`, children: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
inline def _empty(attributes: `0`, children: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
/**
  * Returns the non-disposed `NativeObject` instance (e.g. a widget) associated with the given cid
  * number. The number can be obtained via the [cid](./NativeObject.md#cid) property. Example: If the cid
  * of an object is `'$23'` it can be obtained by `$(23)`. The cid is visible in the log when passing a
  * NativeObject to any log method, e.g. [`console.log(widget)`](./Console.md#logvalues), or
  * [`console.dirxml(widget)`](./Console.md#dirxmlobject). The native object may then be obtained using
  * the developer console or the interactive console feature for the tabris CLI serve command.
  * This feature is meant for debugging purposes only. **Using it in production code is dangerous since
  * it allows interfering with the internals of the framework or encapsulated components.** Also, the
  * `cid` of a NativeObject is not stable, meaning it can change each time the code is executed.
  * @param cidNumber The cid number is the trailing part of the [cid](./NativeObject.md#cid) property string.
  */
/* was `typeof $` */
inline def _empty(cidNumber: Double): NativeObject = ^.asInstanceOf[js.Dynamic].applyDynamic("$")(cidNumber.asInstanceOf[js.Any]).asInstanceOf[NativeObject]
// $
/**
  * A shortcut to [`tabris.contentView.find()`](./Composite.md#findselector). Returns a collection
  * containing all descendants of contentView that match the given selector. This does *not* include any
  * widgets in the drawer, a popover, or an encapsulated custom component. A custom component is
  * encapsulated if it overrides the `children()` method or uses the `@component` decorator.
  * @param selector A selector expression or a predicate function to filter the results.
  */
/* was `typeof $` */
inline def _empty[Result /* <: Widget[Any] */](): WidgetCollection[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("$")().asInstanceOf[WidgetCollection[Result]]
inline def _empty[Result /* <: Widget[Any] */](selector: Selector[Widget[Any], Result]): WidgetCollection[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("$")(selector.asInstanceOf[js.Any]).asInstanceOf[WidgetCollection[Result]]

inline def app: App_ = ^.asInstanceOf[js.Dynamic].selectDynamic("app").asInstanceOf[App_]

inline def asFactory[OriginalConstructor /* <: Constructor[JSXCandidate] & js.Object */, Instance /* <: JSXCandidate */](constructor: OriginalConstructor): CallableConstructor[
OriginalConstructor, 
InstanceType[OriginalConstructor], 
js.Function1[/* repeated */ Any, Widget[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("asFactory")(constructor.asInstanceOf[js.Any]).asInstanceOf[CallableConstructor[
OriginalConstructor, 
InstanceType[OriginalConstructor], 
js.Function1[/* repeated */ Any, Widget[Any]]]]

inline def authentication: Authentication_ = ^.asInstanceOf[js.Dynamic].selectDynamic("authentication").asInstanceOf[Authentication_]

inline def checkType(value: Any, `type`: BaseConstructor[String]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("checkType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[String]
inline def checkType(
  value: Any,
  `type`: BaseConstructor[Boolean | Number | String],
  callback: js.Function1[(/* value */ Boolean) | (/* value */ Double) | (/* value */ String), Any]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def checkType(value: Any, `type`: BaseConstructor[String], options: Name): String = (^.asInstanceOf[js.Dynamic].applyDynamic("checkType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]

inline def checkType_Boolean(value: Any, `type`: BaseConstructor[Boolean]): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Boolean]
inline def checkType_Boolean(value: Any, `type`: BaseConstructor[Boolean], options: Name): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]

inline def checkType_Double(value: Any, `type`: BaseConstructor[Number]): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("checkType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Double]
inline def checkType_Double(value: Any, `type`: BaseConstructor[Number], options: Name): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("checkType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Double]

inline def checkType_T[T](value: Any, `type`: BaseConstructor[T], callback: js.Function1[/* value */ T, Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

inline def checkType_T_T[T](value: Any, `type`: BaseConstructor[T]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("checkType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[T]
inline def checkType_T_T[T](value: Any, `type`: BaseConstructor[T], options: Name): T = (^.asInstanceOf[js.Dynamic].applyDynamic("checkType")(value.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[T]

inline def contentView: ContentView_[Widget[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("contentView").asInstanceOf[ContentView_[Widget[Any]]]

inline def crypto: Crypto = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto").asInstanceOf[Crypto]
inline def crypto_=(x: Crypto): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("crypto")(x.asInstanceOf[js.Any])

inline def devTools: DevTools_ = ^.asInstanceOf[js.Dynamic].selectDynamic("devTools").asInstanceOf[DevTools_]

inline def device: Device_ = ^.asInstanceOf[js.Dynamic].selectDynamic("device").asInstanceOf[Device_]

inline def drawer: Drawer_ = ^.asInstanceOf[js.Dynamic].selectDynamic("drawer").asInstanceOf[Drawer_]

// fetch
/* was `typeof fetch` */
inline def fetch(url: String): js.Promise[typings.tabris.Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.tabris.Response]]
inline def fetch(url: String, init: RequestInit): js.Promise[typings.tabris.Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.tabris.Response]]
inline def fetch(url: typings.tabris.Request): js.Promise[typings.tabris.Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.tabris.Response]]
inline def fetch(url: typings.tabris.Request, init: RequestInit): js.Promise[typings.tabris.Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.tabris.Response]]

inline def format(data: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(data.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
inline def format(message: String, data: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(scala.List(message.asInstanceOf[js.Any]).`++`(data.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]

inline def fs: FileSystem = ^.asInstanceOf[js.Dynamic].selectDynamic("fs").asInstanceOf[FileSystem]

inline def input: Input_ = ^.asInstanceOf[js.Dynamic].selectDynamic("input").asInstanceOf[Input_]

inline def navigationBar: NavigationBar_ = ^.asInstanceOf[js.Dynamic].selectDynamic("navigationBar").asInstanceOf[NavigationBar_]

inline def permission: Permission_ = ^.asInstanceOf[js.Dynamic].selectDynamic("permission").asInstanceOf[Permission_]

inline def printer: Printer_ = ^.asInstanceOf[js.Dynamic].selectDynamic("printer").asInstanceOf[Printer_]

inline def sizeMeasurement: SizeMeasurement_ = ^.asInstanceOf[js.Dynamic].selectDynamic("sizeMeasurement").asInstanceOf[SizeMeasurement_]

inline def statusBar: StatusBar_ = ^.asInstanceOf[js.Dynamic].selectDynamic("statusBar").asInstanceOf[StatusBar_]

inline def tabris: Tabris_ = ^.asInstanceOf[js.Dynamic].selectDynamic("tabris").asInstanceOf[Tabris_]

type ActionConstructor = ActionFactory

type ActivityIndicatorConstructor = ActivityIndicatorFactory

type Attributes[T /* <: JSXCandidate */, TData] = (/* import warning: importer.ImportType#apply Failed type conversion: T['jsxAttributes'] */ js.Any) & Data[TData]

type BaseConstructor[T] = js.Function

type BoxDimensions = Double | String | (js.Tuple4[Double, js.UndefOr[Double], js.UndefOr[Double], js.UndefOr[Double]]) | Bottom

type ButtonConstructor = ButtonFactory

type CameraViewConstructor = CameraViewFactory

type CanvasConstructor = CanvasFactory

type CheckBoxConstructor = CheckBoxFactory

type CollectionViewConstructor = CollectionViewFactory

type ColorArray = (js.Tuple4[Double, Double, Double, Double]) | (js.Tuple3[Double, Double, Double])

/* Rewritten from type alias, can be one of: 
  - typings.tabris.mod.ColorLikeObject
  - typings.tabris.mod.ColorArray
  - java.lang.String
  - typings.tabris.tabrisStrings.initial
  - scala.Null
*/
type ColorValue = _ColorValue | ColorArray | String | Null

type CompleteCb = js.Function0[Unit]

type CompositeConstructor = CompositeFactory

type ConstraintArray = js.Tuple2[SiblingReferenceValue | PercentValue, Offset]

type ConstraintArrayValue = js.Tuple2[SiblingReference | PercentValue, Offset]

/* Rewritten from type alias, can be one of: 
  - typings.tabris.mod.Constraint
  - typings.tabris.mod.ConstraintArrayValue
  - typings.tabris.mod.ConstraintLikeObject
  - typings.tabris.mod.Offset
  - typings.tabris.mod.PercentValue
  - typings.tabris.mod.SiblingReferenceValue
  - typings.tabris.tabrisBooleans.`true`
*/
type ConstraintValue = _ConstraintValue | ConstraintArrayValue | Offset | PercentValue | SiblingReferenceValue

// Crypto
/**
  * The global `crypto` object provides an implementation of the `RandomSource` interface that can be
  * used to generate cryptographically secure random numbers.
  */
/* was `typeof Crypto` */
type CryptoConstructor = Crypto

type Dimension = Double

type ErrorCb = js.Function1[/* value */ Any, Unit]

type ExtendedEvent[EventData, Target] = EventObject[Target] & EventData

type Factory[OriginalConstructor /* <: Constructor[JSXCandidate] & js.Object */, Instance /* <: JSXCandidate */, Selector /* <: js.Function */] = js.Function2[
/* attributes */ js.UndefOr[Attributes[Instance, Any]], 
/* selector */ js.UndefOr[Selector], 
Instance]

type Flatten[T] = js.UndefOr[T | js.Array[T]]

// This type needs to be less strict than FontLikeObject to satisfy tsc when using FontResources.from with JSON
type FontResourceValue = Family | String

/* Rewritten from type alias, can be one of: 
  - typings.tabris.mod.FontLikeObject
  - java.lang.String
  - typings.tabris.tabrisStrings.initial
  - scala.Null
*/
type FontValue = _FontValue | String | Null

// Headers
/**
  * Represents a set of HTTP headers as used by `fetch()`.
  */
/* was `typeof Headers` */
type HeadersConstructor = typings.tabris.Headers

/**
  * Represents pixel data of a `Canvas` widget.
  */
/* was `typeof ImageData` */
type ImageDataConstructor = typings.tabris.ImageData

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typings.tabris.mod.ImageBitmap
  - typings.tabris.Blob
*/
type ImageSource = _ImageSource | String

/* Rewritten from type alias, can be one of: 
  - typings.tabris.mod.ImageLikeObject
  - typings.tabris.mod.Image
  - typings.tabris.mod.ImageSource
  - scala.Null
*/
type ImageValue = _ImageValue | Null | String

type ImageViewConstructor = ImageViewFactory

type JSXAttributes[T /* <: JSXCandidate */, U] = (Properties[U & typings.tabris.anon.Set, Omit[U & typings.tabris.anon.Set, set]]) & ListenersMap[U] & JSXShorthands[U]

/* Rewritten from type alias, can be one of: 
  - T
  - typings.tabris.mod.WidgetCollection[T]
  - js.Array[T | typings.tabris.mod.WidgetCollection[T]]
  - typings.tabris.anon.Cid
  - scala.Unit
*/
type JSXChildren[T /* <: AnyWidget */] = js.UndefOr[_JSXChildren[T] | (js.Array[T | WidgetCollection[T]]) | T]

type JSXCompositeAttributes[ThisType /* <: JSXCandidate */, ChildType /* <: AnyWidget */] = (JSXAttributes[ThisType, Omit[ThisType, set | jsxAttributes]]) & (ApplyChildren[ThisType, ChildType])

// Tabris.js Helper Types
type JSXDefaultChildren = Flatten[String | (Cid & js.Object)]

/* Rewritten from type alias, can be one of: 
  - typings.tabris.mod.LinearGradientLikeObject
  - java.lang.String
  - typings.tabris.tabrisStrings.initial
  - scala.Null
*/
type LinearGradientValue = _LinearGradientValue | String | Null

type Listener[T] = js.Function1[/* ev */ ExtendedEvent[T, js.Object], Any]

// prevent empty object type as possible result, would allow any object
type ListenersKeysOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends tabris.tabris.Listeners<any>? K : never}[keyof T] */ js.Any

type ListenersTriggerParam[T] = Omit[
T, 
/* keyof tabris.tabris.EventObject<any> */ constructor | target | timeStamp | `type`]

type MethodKeysOf[T] = /* import warning: importer.ImportType#apply Failed type conversion: {[ K in keyof T ]: T[K] extends std.Function? K : never}[keyof T] */ js.Any

type ModuleLoader = js.Function5[
/* module */ Module, 
/* exports */ js.Object, 
/* require */ js.Function1[/* fn */ String, js.Object], 
/* __filename */ String, 
/* __dirname */ String, 
Unit]

type NavigationViewConstructor = NavigationViewFactory

type NextCb[T] = js.Function1[/* value */ T, Unit]

type NextString = /* next() */ String

type ObservableDataConstructor = ObservableDataFactory

type Offset = Double

type Omit[T, K /* <: String | js.Symbol | Double */] = Pick[T, Exclude[/* keyof T */ String, K]]

type PageConstructor = PageFactory

type ParentSelector[Candidate /* <: typings.tabris.mod.Composite[Widget[Any]] */, Result /* <: Candidate */] = SelectorString | SelectorFunction[Candidate] | Constructor[Result] | SFC[Result]

type PdfViewConstructor = PdfViewFactory

type PercentString = String

type PercentValue = PercentString | PercentLikeObject

type PickerConstructor = PickerFactory

type PrevString = /* prev() */ String

type ProgressBarConstructor = ProgressBarFactory

type Properties[T /* <: `5` */, U] = (Partial[Omit[U, MethodKeysOf[U] | ReadOnlyWidgetKeys[U]]]) & CidData

type RadioButtonConstructor = RadioButtonFactory

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends { readonly bounds :any} ? std.Extract<keyof T, 'bounds' | 'absoluteBounds' | 'cid' | 'jsxAttributes'> : never
  }}}
  */
type ReadOnlyWidgetKeys[T] = /* keyof T */ String

type RefreshCompositeConstructor = RefreshCompositeFactory

// Request
/**
  * Represents an HTTP Request as used by `fetch()`.
  */
/* was `typeof Request` */
type RequestConstructor = typings.tabris.Request

/* Rewritten from type alias, can be one of: 
  - typings.tabris.tabrisStrings.$schema
  - typings.tabris.tabrisStrings.$scaleFactor
  - typings.tabris.tabrisStrings.$fallbackLanguage
  - typings.tabris.tabrisStrings._underscore
  - typings.tabris.tabrisStrings._empty
  - typings.tabris.tabrisStrings.Exclamationmark
  - typings.tabris.tabrisStrings.Asterisk
  - typings.tabris.tabrisStrings.`@`
  - typings.tabris.tabrisStrings.Space
  - typings.tabris.tabrisStrings.on
  - typings.tabris.tabrisStrings.toString
  - typings.tabris.tabrisStrings.valueOf
  - js.Symbol
  - scala.Double
*/
type ReservedResourceKeys = _ReservedResourceKeys | js.Symbol | Double

type ResourceDataWithConfig[RawType] = NeverResources & Selectable[RawType] & ResourceInlineConfig

type ResourceRawData[RawType] = NeverResources & Selectable[RawType] & js.Object

// Response
/**
  * Represents an HTTP Response as used by `fetch()`.
  */
/* was `typeof Response` */
type ResponseConstructor = typings.tabris.Response

type RowConstructor = RowFactory

type RuleSet[Target] = RuleSetStatic | RuleSetCallback[Target] | Null

type RuleSetCallback[Target] = (js.Function1[/* widget */ Target, RuleSetStatic]) | Null

type RuleSetObject = StringDictionary[Any]

type RuleSetStatic = RuleSetObject | js.Array[RuleSetObject]

type SFC[T] = js.Function2[/* attributes */ js.Object | Null, /* children */ js.Array[Any], T]

type ScrollViewConstructor = ScrollViewFactory

type SearchActionConstructor = SearchActionFactory

/* Rewritten from type alias, can be one of: 
  - T
  - org.scalablytyped.runtime.StringDictionary[scala.Any]
  - scala.Unit
  - typings.tabris.anon.Inherit
  - typings.tabris.anon.Ref
*/
type Selectable[T] = js.UndefOr[_Selectable[T] | StringDictionary[Any] | T]

type Selector[Candidate /* <: AnyWidget */, Result /* <: Candidate */] = SelectorString | SelectorFunction[Candidate] | Constructor[Result] | SFC[Result]

type SelectorFunction[Candidate /* <: AnyWidget */] = js.Function3[
/* widget */ Candidate, 
/* index */ Double, 
/* collection */ WidgetCollection[Candidate], 
Boolean]

type SelectorString = String

type SiblingReference = Widget[Any] | SiblingReferenceSymbol | SiblingSelectorString

type SiblingReferenceSymbol = /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof LayoutData.next */ Any

type SiblingReferenceValue = Widget[Any] | SiblingReferenceSymbol | SiblingSelectorString

type SiblingSelectorString = String

type SliderConstructor = SliderFactory

type StackConstructor = StackFactory

// Storage
/**
  * The `localStorage` object allows storing key-value pairs in a persistent store. Both keys and values
  * are stored as strings.
  * In addition Tabris.js adds support for a `secureStorage` available in the global scope. This is a
  * drop-in replacement for `localStorage` that keeps data encrypted using the Keychain on iOS and the
  * AndroidKeyStore on Android 6+. Note that on Android 5 the store is encrypted but does not use
  * hardware encryption.
  * The `localStorage` is only meant to store relatively short strings. To store larger amounts of data
  * it is recommended to use the [FileSystem](./fs.html) API.
  */
/* was `typeof Storage` */
type StorageConstructor = typings.tabris.Storage

type SubscriptionHandler[T] = js.ThisFunction1[/* this */ Observable[T], /* subscriber */ Subscriber[T], TeardownLogic]

type SwitchConstructor = SwitchFactory

type TabConstructor = TabFactory

type TabFolderConstructor = TabFolderFactory

type TeardownLogic = js.Function | Unsubscribe | Unit

type TextInputConstructor = TextInputFactory

type TextViewConstructor = TextViewFactory

type ToggleButtonConstructor = ToggleButtonFactory

/** NOTE: Conditional type definitions are impossible to translate to Scala.
  * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
  * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
  * TS definition: {{{
  T extends tabris.tabris.Listeners<infer U> ? tabris.tabris.Listener<U> : T
  }}}
  */
type UnpackListeners[T] = T

type VideoConstructor = VideoFactory

type WebViewConstructor = WebViewFactory
