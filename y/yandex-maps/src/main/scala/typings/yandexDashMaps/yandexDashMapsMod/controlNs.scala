package typings.yandexDashMaps.yandexDashMapsMod

import typings.std.HTMLElement
import typings.yandexDashMaps.Anon_AdjustMapMargin
import typings.yandexDashMaps.Anon_AdjustMapMarginAuto
import typings.yandexDashMaps.Anon_AdjustMapMarginPosition
import typings.yandexDashMaps.Anon_Auto
import typings.yandexDashMaps.Anon_Bottom
import typings.yandexDashMaps.Anon_CollapseOnBlur
import typings.yandexDashMaps.Anon_Content
import typings.yandexDashMaps.Anon_ContentString
import typings.yandexDashMaps.Anon_Enabled
import typings.yandexDashMaps.Anon_Expanded
import typings.yandexDashMaps.Anon_Image
import typings.yandexDashMaps.Anon_Layout
import typings.yandexDashMaps.Anon_NoPlacemark
import typings.yandexDashMaps.Anon_Selected
import typings.yandexDashMaps.Anon_Title
import typings.yandexDashMaps.yandexDashMapsMod.controlNs.Button
import typings.yandexDashMaps.yandexDashMapsMod.controlNs.IBaseButtonParametersOptions
import typings.yandexDashMaps.yandexDashMapsMod.controlNs.IButtonParameters
import typings.yandexDashMaps.yandexDashMapsMod.controlNs.IFullscreenControlParameters
import typings.yandexDashMaps.yandexDashMapsMod.controlNs.IGeolocationControlParameters
import typings.yandexDashMaps.yandexDashMapsMod.controlNs.IListBoxItemParameters
import typings.yandexDashMaps.yandexDashMapsMod.controlNs.IListBoxParameters
import typings.yandexDashMaps.yandexDashMapsMod.controlNs.IManagerControlOptions
import typings.yandexDashMaps.yandexDashMapsMod.controlNs.IManagerOptions
import typings.yandexDashMaps.yandexDashMapsMod.controlNs.IRouteButtonParameters
import typings.yandexDashMaps.yandexDashMapsMod.controlNs.IRouteEditorParameters
import typings.yandexDashMaps.yandexDashMapsMod.controlNs.IRulerControlParameters
import typings.yandexDashMaps.yandexDashMapsMod.controlNs.ISearchControlParameters
import typings.yandexDashMaps.yandexDashMapsMod.routerNs.Route
import typings.yandexDashMaps.yandexDashMapsStrings.left
import typings.yandexDashMaps.yandexDashMapsStrings.none
import typings.yandexDashMaps.yandexDashMapsStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "control")
@js.native
object controlNs extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.yandexDashMaps.yandexDashMapsMod.ICustomizable because var conflicts: events. Inlined options */ @js.native
  class Button () extends ISelectableControl {
    def this(parameters: String) = this()
    def this(parameters: IButtonParameters) = this()
    var data: typings.yandexDashMaps.yandexDashMapsMod.dataNs.Manager = js.native
    /* CompleteClass */
    override var events: IEventManager = js.native
    var options: IOptionManager = js.native
    var state: typings.yandexDashMaps.yandexDashMapsMod.dataNs.Manager = js.native
    def setParent(parent: IControlParent): this.type = js.native
  }
  
  @js.native
  class FullscreenControl () extends Button {
    def this(parameters: IFullscreenControlParameters) = this()
    def enterFullscreen(): Unit = js.native
    def exitFullscreen(): Unit = js.native
  }
  
  @js.native
  class GeolocationControl () extends Button {
    def this(parameters: IGeolocationControlParameters) = this()
  }
  
  trait IBaseButtonParametersOptions extends js.Object {
    var adjustMapMargin: js.UndefOr[Boolean] = js.undefined
    var float: js.UndefOr[none | left | right] = js.undefined
    var floatIndex: js.UndefOr[Double] = js.undefined
    var layout: js.UndefOr[IClassConstructor[ISelectableControlLayout] | String] = js.undefined
    var maxWidth: js.UndefOr[(js.Array[js.Array[Double] | Double]) | Double] = js.undefined
    var position: js.UndefOr[Anon_Bottom] = js.undefined
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  
  trait IButtonParameters extends js.Object {
    var data: js.UndefOr[Anon_Content] = js.undefined
    var options: js.UndefOr[IBaseButtonParametersOptions with Anon_Auto] = js.undefined
    var state: js.UndefOr[Anon_Enabled] = js.undefined
  }
  
  trait IFullscreenControlParameters extends js.Object {
    var data: js.UndefOr[Anon_Title] = js.undefined
    var options: js.UndefOr[IBaseButtonParametersOptions with Anon_CollapseOnBlur] = js.undefined
    var state: js.UndefOr[Anon_Expanded] = js.undefined
  }
  
  trait IGeolocationControlParameters extends IButtonParameters {
    @JSName("data")
    var data_IGeolocationControlParameters: js.UndefOr[Anon_Image] = js.undefined
    @JSName("options")
    var options_IGeolocationControlParameters: js.UndefOr[IBaseButtonParametersOptions] = js.undefined
  }
  
  trait IListBoxItemParameters extends js.Object {
    var data: js.UndefOr[Anon_ContentString] = js.undefined
    var options: js.UndefOr[Anon_Layout] = js.undefined
    var state: js.UndefOr[Anon_Selected] = js.undefined
  }
  
  trait IListBoxParameters extends IButtonParameters {
    @JSName("options")
    var options_IListBoxParameters: js.UndefOr[IBaseButtonParametersOptions with Anon_NoPlacemark] = js.undefined
  }
  
  trait IManagerControlOptions extends js.Object {
    var float: js.UndefOr[none | left | right] = js.undefined
    var floatIndex: js.UndefOr[Double] = js.undefined
    var position: js.UndefOr[Anon_Bottom] = js.undefined
  }
  
  trait IManagerOptions extends js.Object {
    var margin: js.UndefOr[Double] = js.undefined
    var pane: js.UndefOr[IPane] = js.undefined
    var states: js.UndefOr[js.Array[String]] = js.undefined
  }
  
  trait IRouteButtonParameters extends js.Object {
    var options: js.UndefOr[Anon_AdjustMapMargin] = js.undefined
    var state: js.UndefOr[Anon_Expanded] = js.undefined
  }
  
  trait IRouteEditorParameters extends js.Object {
    var data: js.UndefOr[Anon_Image] = js.undefined
    var options: js.UndefOr[IBaseButtonParametersOptions] = js.undefined
    var state: js.UndefOr[js.Object] = js.undefined
  }
  
  trait IRulerControlParameters extends js.Object {
    var data: js.UndefOr[js.Object] = js.undefined
    var options: js.UndefOr[Anon_AdjustMapMarginPosition] = js.undefined
    var state: js.UndefOr[js.Object] = js.undefined
  }
  
  trait ISearchControlParameters extends js.Object {
    var data: js.UndefOr[js.Object] = js.undefined
    var options: js.UndefOr[Anon_AdjustMapMarginAuto] = js.undefined
    var state: js.UndefOr[js.Object] = js.undefined
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.yandexDashMaps.yandexDashMapsMod.ICustomizable because var conflicts: events. Inlined options- typings.yandexDashMaps.yandexDashMapsMod.ICollection because var conflicts: events. Inlined add, getIterator, remove */ @js.native
  class ListBox () extends IControl {
    def this(parameters: IListBoxParameters) = this()
    var data: typings.yandexDashMaps.yandexDashMapsMod.dataNs.Manager = js.native
    /* CompleteClass */
    override var events: IEventManager = js.native
    var options: IOptionManager = js.native
    var state: typings.yandexDashMaps.yandexDashMapsMod.dataNs.Manager = js.native
    def add(`object`: js.Object): this.type = js.native
    def getIterator(): IIterator = js.native
    def remove(`object`: js.Object): this.type = js.native
    def setParent(parent: IControlParent): this.type = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.yandexDashMaps.yandexDashMapsMod.ICustomizable because var conflicts: events. Inlined options */ @js.native
  class ListBoxItem () extends ISelectableControl {
    def this(parameters: IListBoxItemParameters) = this()
    var data: typings.yandexDashMaps.yandexDashMapsMod.dataNs.Manager = js.native
    /* CompleteClass */
    override var events: IEventManager = js.native
    var options: IOptionManager = js.native
    var state: typings.yandexDashMaps.yandexDashMapsMod.dataNs.Manager = js.native
    def getMap(): Map = js.native
    def setParent(parent: IControlParent): this.type = js.native
  }
  
  @js.native
  class Manager protected () extends js.Object {
    def this(map: Map) = this()
    def this(map: Map, controls: js.Array[String | IControl]) = this()
    def this(map: Map, controls: js.Array[String | IControl], options: IManagerOptions) = this()
    var events: typings.yandexDashMaps.yandexDashMapsMod.eventNs.Manager = js.native
    var options: typings.yandexDashMaps.yandexDashMapsMod.optionNs.Manager = js.native
    var state: typings.yandexDashMaps.yandexDashMapsMod.dataNs.Manager = js.native
    def add(control: ControlKey): this.type = js.native
    def add(control: ControlKey, options: IManagerControlOptions): this.type = js.native
    def add(control: IControl): this.type = js.native
    def add(control: IControl, options: IManagerControlOptions): this.type = js.native
    def each(callback: js.Function1[/* control */ IControl, Unit]): this.type = js.native
    def each(callback: js.Function1[/* control */ IControl, Unit], context: js.Object): this.type = js.native
    def get(index: String): IControl | Null = js.native
    def get(index: Double): IControl | Null = js.native
    def getChildElement(control: IControl): js.Promise[HTMLElement] = js.native
    def getContainer(): HTMLElement = js.native
    def getMap(): Map = js.native
    def indexOf(childToFind: String): Double = js.native
    def indexOf(childToFind: IControl): Double = js.native
    def remove(control: String): this.type = js.native
    def remove(control: IControl): this.type = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.yandexDashMaps.yandexDashMapsMod.ICustomizable because var conflicts: events. Inlined options */ @js.native
  class RouteButton () extends IControl {
    def this(parameters: IRouteButtonParameters) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
    var options: IOptionManager = js.native
    var routePanel: IRoutePanel = js.native
    def setParent(parent: IControlParent): this.type = js.native
  }
  
  @js.native
  class RouteEditor () extends Button {
    def this(parameters: IRouteEditorParameters) = this()
    def getRoute(): Route = js.native
  }
  
  @js.native
  class RulerControl () extends Button {
    def this(parameters: IRulerControlParameters) = this()
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - typings.yandexDashMaps.yandexDashMapsMod.ICustomizable because var conflicts: events. Inlined options */ @js.native
  class SearchControl () extends IControl {
    def this(parameters: ISearchControlParameters) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
    var options: IOptionManager = js.native
    var state: typings.yandexDashMaps.yandexDashMapsMod.dataNs.Manager = js.native
    def clear(): Unit = js.native
    def getMap(): Map = js.native
    def getRequestString(): String = js.native
    def getResponseMetaData(): js.Object = js.native
    def getResult(index: Double): js.Promise[js.Object] = js.native
    def getResultsArray(): js.Array[js.Object] = js.native
    def getResultsCount(): Double = js.native
    def getSelectedIndex(): Double = js.native
    def hideResult(): Unit = js.native
    def search(request: String): js.Promise[Unit] = js.native
    def setParent(parent: IControlParent): this.type = js.native
    def showResult(index: Double): this.type = js.native
  }
  
}

