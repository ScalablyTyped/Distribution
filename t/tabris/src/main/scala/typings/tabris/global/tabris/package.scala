package typings.tabris.global.tabris

import typings.std.InstanceType
import typings.std.Number
import typings.tabris.Crypto
import typings.tabris.RequestInit
import typings.tabris.anon.Attribute
import typings.tabris.anon.Children
import typings.tabris.anon.Name
import typings.tabris.anon.`0`
import typings.tabris.global.tabris.^
import typings.tabris.mod.ActionFactory
import typings.tabris.mod.ActivityIndicatorFactory
import typings.tabris.mod.ApplyAttributes
import typings.tabris.mod.Attributes
import typings.tabris.mod.BaseConstructor
import typings.tabris.mod.ButtonFactory
import typings.tabris.mod.CallableConstructor
import typings.tabris.mod.CameraViewFactory
import typings.tabris.mod.CanvasFactory
import typings.tabris.mod.CheckBoxFactory
import typings.tabris.mod.CollectionViewFactory
import typings.tabris.mod.CompositeFactory
import typings.tabris.mod.Constructor
import typings.tabris.mod.ImageViewFactory
import typings.tabris.mod.JSXCandidate
import typings.tabris.mod.JSXChildren
import typings.tabris.mod.NavigationViewFactory
import typings.tabris.mod.ObservableDataFactory
import typings.tabris.mod.PageFactory
import typings.tabris.mod.PdfViewFactory
import typings.tabris.mod.PickerFactory
import typings.tabris.mod.ProgressBarFactory
import typings.tabris.mod.RadioButtonFactory
import typings.tabris.mod.RefreshCompositeFactory
import typings.tabris.mod.RowFactory
import typings.tabris.mod.RuleSet
import typings.tabris.mod.ScrollViewFactory
import typings.tabris.mod.SearchActionFactory
import typings.tabris.mod.Selector
import typings.tabris.mod.SelectorString
import typings.tabris.mod.SliderFactory
import typings.tabris.mod.StackFactory
import typings.tabris.mod.SwitchFactory
import typings.tabris.mod.TabFactory
import typings.tabris.mod.TabFolderFactory
import typings.tabris.mod.TextInputFactory
import typings.tabris.mod.TextViewFactory
import typings.tabris.mod.ToggleButtonFactory
import typings.tabris.mod.VideoFactory
import typings.tabris.mod.WebViewFactory
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def Action: ActionFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Action").asInstanceOf[ActionFactory]

inline def ActivityIndicator: ActivityIndicatorFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("ActivityIndicator").asInstanceOf[ActivityIndicatorFactory]

inline def Apply[WidgetConstructor /* <: BaseConstructor[typings.tabris.mod.Widget[Any]] */](attr: ApplyAttributes[WidgetConstructor]): typings.tabris.anon.Apply = ^.asInstanceOf[js.Dynamic].applyDynamic("Apply")(attr.asInstanceOf[js.Any]).asInstanceOf[typings.tabris.anon.Apply]

inline def Button: ButtonFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Button").asInstanceOf[ButtonFactory]

inline def CameraView: CameraViewFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("CameraView").asInstanceOf[CameraViewFactory]

inline def Canvas: CanvasFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Canvas").asInstanceOf[CanvasFactory]

inline def CheckBox: CheckBoxFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("CheckBox").asInstanceOf[CheckBoxFactory]

inline def CollectionView: CollectionViewFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("CollectionView").asInstanceOf[CollectionViewFactory]

inline def Composite: CompositeFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Composite").asInstanceOf[CompositeFactory]

inline def ImageView: ImageViewFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("ImageView").asInstanceOf[ImageViewFactory]

inline def NavigationView: NavigationViewFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("NavigationView").asInstanceOf[NavigationViewFactory]

inline def ObservableData: ObservableDataFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("ObservableData").asInstanceOf[ObservableDataFactory]

inline def Page: PageFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Page").asInstanceOf[PageFactory]

inline def PdfView: PdfViewFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("PdfView").asInstanceOf[PdfViewFactory]

inline def Picker: PickerFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Picker").asInstanceOf[PickerFactory]

inline def ProgressBar: ProgressBarFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("ProgressBar").asInstanceOf[ProgressBarFactory]

inline def RadioButton: RadioButtonFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("RadioButton").asInstanceOf[RadioButtonFactory]

inline def RefreshComposite: RefreshCompositeFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("RefreshComposite").asInstanceOf[RefreshCompositeFactory]

inline def Row: RowFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Row").asInstanceOf[RowFactory]

inline def ScrollView: ScrollViewFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("ScrollView").asInstanceOf[ScrollViewFactory]

inline def SearchAction: SearchActionFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("SearchAction").asInstanceOf[SearchActionFactory]

inline def Set[TargetConstructor /* <: BaseConstructor[typings.tabris.mod.NativeObject] */, ResultType, AttrName /* <: /* keyof ResultType */ String */](attr: Attribute[TargetConstructor, AttrName, ResultType]): ResultType = ^.asInstanceOf[js.Dynamic].applyDynamic("Set")(attr.asInstanceOf[js.Any]).asInstanceOf[ResultType]

inline def Set_prototype[WidgetConstructor /* <: BaseConstructor[typings.tabris.mod.Widget[Any]] */](
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
inline def Set_prototype[WidgetConstructor /* <: BaseConstructor[typings.tabris.mod.Widget[Any]] */](
  target: WidgetConstructor,
  selector: SelectorString,
  attributes: Attributes[
  /* import warning: importer.ImportType#apply Failed type conversion: WidgetConstructor['prototype'] */ js.Any, 
  Any
]
): RuleSet[typings.tabris.mod.Widget[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Set")(target.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[RuleSet[typings.tabris.mod.Widget[Any]]]

inline def Setter[TargetConstructor /* <: BaseConstructor[typings.tabris.mod.NativeObject] */, ResultType, AttrName /* <: /* keyof ResultType */ String */](attr: Attribute[TargetConstructor, AttrName, ResultType]): ResultType = ^.asInstanceOf[js.Dynamic].applyDynamic("Setter")(attr.asInstanceOf[js.Any]).asInstanceOf[ResultType]

inline def Setter_prototype[WidgetConstructor /* <: BaseConstructor[typings.tabris.mod.Widget[Any]] */](
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
inline def Setter_prototype[WidgetConstructor /* <: BaseConstructor[typings.tabris.mod.Widget[Any]] */](
  target: WidgetConstructor,
  selector: SelectorString,
  attributes: Attributes[
  /* import warning: importer.ImportType#apply Failed type conversion: WidgetConstructor['prototype'] */ js.Any, 
  Any
]
): RuleSet[typings.tabris.mod.Widget[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("Setter")(target.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[RuleSet[typings.tabris.mod.Widget[Any]]]

inline def Slider: SliderFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Slider").asInstanceOf[SliderFactory]

inline def Stack: StackFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Stack").asInstanceOf[StackFactory]

inline def Switch: SwitchFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Switch").asInstanceOf[SwitchFactory]

inline def Tab: TabFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Tab").asInstanceOf[TabFactory]

inline def TabFolder: TabFolderFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("TabFolder").asInstanceOf[TabFolderFactory]

inline def TextInput: TextInputFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("TextInput").asInstanceOf[TextInputFactory]

inline def TextView: TextViewFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("TextView").asInstanceOf[TextViewFactory]

inline def ToggleButton: ToggleButtonFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("ToggleButton").asInstanceOf[ToggleButtonFactory]

inline def Video: VideoFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("Video").asInstanceOf[VideoFactory]

inline def WebView: WebViewFactory = ^.asInstanceOf[js.Dynamic].selectDynamic("WebView").asInstanceOf[WebViewFactory]

inline def _empty(attributes: Null, children: String): String = (^.asInstanceOf[js.Dynamic].applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
inline def _empty(attributes: Null, children: js.Array[Null | String | Double | Boolean]): String = (^.asInstanceOf[js.Dynamic].applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
inline def _empty(attributes: Null, children: Boolean): String = (^.asInstanceOf[js.Dynamic].applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
inline def _empty(attributes: Null, children: Double): String = (^.asInstanceOf[js.Dynamic].applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[String]
inline def _empty(attributes: Null, children: JSXChildren[typings.tabris.mod.Widget[Any]]): typings.tabris.mod.WidgetCollection[typings.tabris.mod.Widget[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.tabris.mod.WidgetCollection[typings.tabris.mod.Widget[Any]]]
/**
  * A JSX stateless functional component that groups all given widgets in a WidgetCollection
  * @param attributes This parameter needs to be null since <$> does not support any attributes
  * @param children The widgets to be included in the resulting WidgetCollection instance.
  */
/* was `typeof $` */
inline def _empty(attributes: Children, children: JSXChildren[typings.tabris.mod.Widget[Any]]): typings.tabris.mod.WidgetCollection[typings.tabris.mod.Widget[Any]] = (^.asInstanceOf[js.Dynamic].applyDynamic("$")(attributes.asInstanceOf[js.Any], children.asInstanceOf[js.Any])).asInstanceOf[typings.tabris.mod.WidgetCollection[typings.tabris.mod.Widget[Any]]]
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
inline def _empty(cidNumber: Double): typings.tabris.mod.NativeObject = ^.asInstanceOf[js.Dynamic].applyDynamic("$")(cidNumber.asInstanceOf[js.Any]).asInstanceOf[typings.tabris.mod.NativeObject]
// $
/**
  * A shortcut to [`tabris.contentView.find()`](./Composite.md#findselector). Returns a collection
  * containing all descendants of contentView that match the given selector. This does *not* include any
  * widgets in the drawer, a popover, or an encapsulated custom component. A custom component is
  * encapsulated if it overrides the `children()` method or uses the `@component` decorator.
  * @param selector A selector expression or a predicate function to filter the results.
  */
/* was `typeof $` */
inline def _empty[Result /* <: typings.tabris.mod.Widget[Any] */](): typings.tabris.mod.WidgetCollection[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("$")().asInstanceOf[typings.tabris.mod.WidgetCollection[Result]]
inline def _empty[Result /* <: typings.tabris.mod.Widget[Any] */](selector: Selector[typings.tabris.mod.Widget[Any], Result]): typings.tabris.mod.WidgetCollection[Result] = ^.asInstanceOf[js.Dynamic].applyDynamic("$")(selector.asInstanceOf[js.Any]).asInstanceOf[typings.tabris.mod.WidgetCollection[Result]]

inline def app: typings.tabris.mod.App_ = ^.asInstanceOf[js.Dynamic].selectDynamic("app").asInstanceOf[typings.tabris.mod.App_]

inline def asFactory[OriginalConstructor /* <: Constructor[JSXCandidate] & js.Object */, Instance /* <: JSXCandidate */](constructor: OriginalConstructor): CallableConstructor[
OriginalConstructor, 
InstanceType[OriginalConstructor], 
js.Function1[/* repeated */ Any, typings.tabris.mod.Widget[Any]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("asFactory")(constructor.asInstanceOf[js.Any]).asInstanceOf[CallableConstructor[
OriginalConstructor, 
InstanceType[OriginalConstructor], 
js.Function1[/* repeated */ Any, typings.tabris.mod.Widget[Any]]]]

inline def authentication: typings.tabris.mod.Authentication_ = ^.asInstanceOf[js.Dynamic].selectDynamic("authentication").asInstanceOf[typings.tabris.mod.Authentication_]

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

inline def contentView: typings.tabris.mod.ContentView_[typings.tabris.mod.Widget[Any]] = ^.asInstanceOf[js.Dynamic].selectDynamic("contentView").asInstanceOf[typings.tabris.mod.ContentView_[typings.tabris.mod.Widget[Any]]]

inline def crypto: Crypto = ^.asInstanceOf[js.Dynamic].selectDynamic("crypto").asInstanceOf[Crypto]
inline def crypto_=(x: Crypto): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("crypto")(x.asInstanceOf[js.Any])

inline def devTools: typings.tabris.mod.DevTools_ = ^.asInstanceOf[js.Dynamic].selectDynamic("devTools").asInstanceOf[typings.tabris.mod.DevTools_]

inline def device: typings.tabris.mod.Device_ = ^.asInstanceOf[js.Dynamic].selectDynamic("device").asInstanceOf[typings.tabris.mod.Device_]

inline def drawer: typings.tabris.mod.Drawer_ = ^.asInstanceOf[js.Dynamic].selectDynamic("drawer").asInstanceOf[typings.tabris.mod.Drawer_]

// fetch
/* was `typeof fetch` */
inline def fetch(url: String): js.Promise[typings.tabris.Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.tabris.Response]]
inline def fetch(url: String, init: RequestInit): js.Promise[typings.tabris.Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.tabris.Response]]
inline def fetch(url: typings.tabris.Request): js.Promise[typings.tabris.Response] = ^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.tabris.Response]]
inline def fetch(url: typings.tabris.Request, init: RequestInit): js.Promise[typings.tabris.Response] = (^.asInstanceOf[js.Dynamic].applyDynamic("fetch")(url.asInstanceOf[js.Any], init.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.tabris.Response]]

inline def format(data: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(data.asInstanceOf[Seq[js.Any]]*).asInstanceOf[String]
inline def format(message: String, data: Any*): String = ^.asInstanceOf[js.Dynamic].applyDynamic("format")(scala.List(message.asInstanceOf[js.Any]).`++`(data.asInstanceOf[Seq[js.Any]])*).asInstanceOf[String]

inline def fs: typings.tabris.mod.FileSystem = ^.asInstanceOf[js.Dynamic].selectDynamic("fs").asInstanceOf[typings.tabris.mod.FileSystem]

inline def input: typings.tabris.mod.Input_ = ^.asInstanceOf[js.Dynamic].selectDynamic("input").asInstanceOf[typings.tabris.mod.Input_]

inline def navigationBar: typings.tabris.mod.NavigationBar_ = ^.asInstanceOf[js.Dynamic].selectDynamic("navigationBar").asInstanceOf[typings.tabris.mod.NavigationBar_]

inline def permission: typings.tabris.mod.Permission_ = ^.asInstanceOf[js.Dynamic].selectDynamic("permission").asInstanceOf[typings.tabris.mod.Permission_]

inline def printer: typings.tabris.mod.Printer_ = ^.asInstanceOf[js.Dynamic].selectDynamic("printer").asInstanceOf[typings.tabris.mod.Printer_]

inline def sizeMeasurement: typings.tabris.mod.SizeMeasurement_ = ^.asInstanceOf[js.Dynamic].selectDynamic("sizeMeasurement").asInstanceOf[typings.tabris.mod.SizeMeasurement_]

inline def statusBar: typings.tabris.mod.StatusBar_ = ^.asInstanceOf[js.Dynamic].selectDynamic("statusBar").asInstanceOf[typings.tabris.mod.StatusBar_]

inline def tabris: typings.tabris.mod.Tabris_ = ^.asInstanceOf[js.Dynamic].selectDynamic("tabris").asInstanceOf[typings.tabris.mod.Tabris_]
