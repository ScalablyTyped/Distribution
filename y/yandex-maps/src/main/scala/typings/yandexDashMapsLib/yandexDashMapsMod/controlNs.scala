package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "control")
@js.native
object controlNs extends js.Object {
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - yandexDashMapsLib.yandexDashMapsMod.ICustomizable because var conflicts: events. Inlined options */ @js.native
  class Button ()
    extends yandexDashMapsLib.yandexDashMapsMod.ISelectableControl {
    def this(parameters: java.lang.String) = this()
    def this(parameters: IButtonParameters) = this()
    var data: yandexDashMapsLib.yandexDashMapsMod.dataNs.Manager = js.native
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    var options: yandexDashMapsLib.yandexDashMapsMod.IOptionManager = js.native
    var state: yandexDashMapsLib.yandexDashMapsMod.dataNs.Manager = js.native
    def setParent(parent: yandexDashMapsLib.yandexDashMapsMod.IControlParent): this.type = js.native
  }
  
  @js.native
  class FullscreenControl () extends Button {
    def this(parameters: IFullscreenControlParameters) = this()
    def enterFullscreen(): scala.Unit = js.native
    def exitFullscreen(): scala.Unit = js.native
  }
  
  @js.native
  class GeolocationControl () extends Button {
    def this(parameters: IGeolocationControlParameters) = this()
  }
  
  trait IBaseButtonParametersOptions extends js.Object {
    var adjustMapMargin: js.UndefOr[scala.Boolean] = js.undefined
    var float: js.UndefOr[
        yandexDashMapsLib.yandexDashMapsLibStrings.none | yandexDashMapsLib.yandexDashMapsLibStrings.left | yandexDashMapsLib.yandexDashMapsLibStrings.right
      ] = js.undefined
    var floatIndex: js.UndefOr[scala.Double] = js.undefined
    var layout: js.UndefOr[
        yandexDashMapsLib.yandexDashMapsMod.IClassConstructor[yandexDashMapsLib.yandexDashMapsMod.ISelectableControlLayout] | java.lang.String
      ] = js.undefined
    var maxWidth: js.UndefOr[(js.Array[js.Array[scala.Double] | scala.Double]) | scala.Double] = js.undefined
    var position: js.UndefOr[yandexDashMapsLib.Anon_Bottom] = js.undefined
    var visible: js.UndefOr[scala.Boolean] = js.undefined
  }
  
  trait IButtonParameters extends js.Object {
    var data: js.UndefOr[yandexDashMapsLib.Anon_Content] = js.undefined
    var options: js.UndefOr[IBaseButtonParametersOptions with yandexDashMapsLib.Anon_Auto] = js.undefined
    var state: js.UndefOr[yandexDashMapsLib.Anon_Enabled] = js.undefined
  }
  
  trait IFullscreenControlParameters extends js.Object {
    var data: js.UndefOr[yandexDashMapsLib.Anon_Title] = js.undefined
    var options: js.UndefOr[IBaseButtonParametersOptions with yandexDashMapsLib.Anon_CollapseOnBlur] = js.undefined
    var state: js.UndefOr[yandexDashMapsLib.Anon_Expanded] = js.undefined
  }
  
  trait IGeolocationControlParameters extends IButtonParameters {
    @JSName("data")
    var data_IGeolocationControlParameters: js.UndefOr[yandexDashMapsLib.Anon_Image] = js.undefined
    @JSName("options")
    var options_IGeolocationControlParameters: js.UndefOr[IBaseButtonParametersOptions] = js.undefined
  }
  
  trait IListBoxItemParameters extends js.Object {
    var data: js.UndefOr[yandexDashMapsLib.Anon_ContentString] = js.undefined
    var options: js.UndefOr[yandexDashMapsLib.Anon_Layout] = js.undefined
    var state: js.UndefOr[yandexDashMapsLib.Anon_Selected] = js.undefined
  }
  
  trait IListBoxParameters extends IButtonParameters {
    @JSName("options")
    var options_IListBoxParameters: js.UndefOr[IBaseButtonParametersOptions with yandexDashMapsLib.Anon_NoPlacemark] = js.undefined
  }
  
  trait IManagerControlOptions extends js.Object {
    var float: js.UndefOr[
        yandexDashMapsLib.yandexDashMapsLibStrings.none | yandexDashMapsLib.yandexDashMapsLibStrings.left | yandexDashMapsLib.yandexDashMapsLibStrings.right
      ] = js.undefined
    var floatIndex: js.UndefOr[scala.Double] = js.undefined
    var position: js.UndefOr[yandexDashMapsLib.Anon_Bottom] = js.undefined
  }
  
  trait IManagerOptions extends js.Object {
    var margin: js.UndefOr[scala.Double] = js.undefined
    var pane: js.UndefOr[yandexDashMapsLib.yandexDashMapsMod.IPane] = js.undefined
    var states: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  }
  
  trait IRouteButtonParameters extends js.Object {
    var options: js.UndefOr[yandexDashMapsLib.Anon_AdjustMapMargin] = js.undefined
    var state: js.UndefOr[yandexDashMapsLib.Anon_Expanded] = js.undefined
  }
  
  trait IRouteEditorParameters extends js.Object {
    var data: js.UndefOr[yandexDashMapsLib.Anon_Image] = js.undefined
    var options: js.UndefOr[IBaseButtonParametersOptions] = js.undefined
    var state: js.UndefOr[js.Object] = js.undefined
  }
  
  trait IRulerControlParameters extends js.Object {
    var data: js.UndefOr[js.Object] = js.undefined
    var options: js.UndefOr[yandexDashMapsLib.Anon_AdjustMapMarginPosition] = js.undefined
    var state: js.UndefOr[js.Object] = js.undefined
  }
  
  trait ISearchControlParameters extends js.Object {
    var data: js.UndefOr[js.Object] = js.undefined
    var options: js.UndefOr[yandexDashMapsLib.Anon_AdjustMapMarginAuto] = js.undefined
    var state: js.UndefOr[js.Object] = js.undefined
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - yandexDashMapsLib.yandexDashMapsMod.ICustomizable because var conflicts: events. Inlined options- yandexDashMapsLib.yandexDashMapsMod.ICollection because var conflicts: events. Inlined add, getIterator, remove */ @js.native
  class ListBox ()
    extends yandexDashMapsLib.yandexDashMapsMod.IControl {
    def this(parameters: IListBoxParameters) = this()
    var data: yandexDashMapsLib.yandexDashMapsMod.dataNs.Manager = js.native
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    var options: yandexDashMapsLib.yandexDashMapsMod.IOptionManager = js.native
    var state: yandexDashMapsLib.yandexDashMapsMod.dataNs.Manager = js.native
    def add(`object`: js.Object): this.type = js.native
    def getIterator(): yandexDashMapsLib.yandexDashMapsMod.IIterator = js.native
    def remove(`object`: js.Object): this.type = js.native
    def setParent(parent: yandexDashMapsLib.yandexDashMapsMod.IControlParent): this.type = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - yandexDashMapsLib.yandexDashMapsMod.ICustomizable because var conflicts: events. Inlined options */ @js.native
  class ListBoxItem ()
    extends yandexDashMapsLib.yandexDashMapsMod.ISelectableControl {
    def this(parameters: IListBoxItemParameters) = this()
    var data: yandexDashMapsLib.yandexDashMapsMod.dataNs.Manager = js.native
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    var options: yandexDashMapsLib.yandexDashMapsMod.IOptionManager = js.native
    var state: yandexDashMapsLib.yandexDashMapsMod.dataNs.Manager = js.native
    def getMap(): yandexDashMapsLib.yandexDashMapsMod.Map = js.native
    def setParent(parent: yandexDashMapsLib.yandexDashMapsMod.IControlParent): this.type = js.native
  }
  
  @js.native
  class Manager protected () extends js.Object {
    def this(map: yandexDashMapsLib.yandexDashMapsMod.Map) = this()
    def this(map: yandexDashMapsLib.yandexDashMapsMod.Map, controls: js.Array[java.lang.String | yandexDashMapsLib.yandexDashMapsMod.IControl]) = this()
    def this(map: yandexDashMapsLib.yandexDashMapsMod.Map, controls: js.Array[java.lang.String | yandexDashMapsLib.yandexDashMapsMod.IControl], options: IManagerOptions) = this()
    var events: yandexDashMapsLib.yandexDashMapsMod.eventNs.Manager = js.native
    var options: yandexDashMapsLib.yandexDashMapsMod.optionNs.Manager = js.native
    var state: yandexDashMapsLib.yandexDashMapsMod.dataNs.Manager = js.native
    def add(control: yandexDashMapsLib.yandexDashMapsMod.ControlKey): this.type = js.native
    def add(control: yandexDashMapsLib.yandexDashMapsMod.ControlKey, options: IManagerControlOptions): this.type = js.native
    def add(control: yandexDashMapsLib.yandexDashMapsMod.IControl): this.type = js.native
    def add(control: yandexDashMapsLib.yandexDashMapsMod.IControl, options: IManagerControlOptions): this.type = js.native
    def each(callback: js.Function1[/* control */ yandexDashMapsLib.yandexDashMapsMod.IControl, scala.Unit]): this.type = js.native
    def each(
      callback: js.Function1[/* control */ yandexDashMapsLib.yandexDashMapsMod.IControl, scala.Unit],
      context: js.Object
    ): this.type = js.native
    def get(index: java.lang.String): yandexDashMapsLib.yandexDashMapsMod.IControl | scala.Null = js.native
    def get(index: scala.Double): yandexDashMapsLib.yandexDashMapsMod.IControl | scala.Null = js.native
    def getChildElement(control: yandexDashMapsLib.yandexDashMapsMod.IControl): js.Promise[stdLib.HTMLElement] = js.native
    def getContainer(): stdLib.HTMLElement = js.native
    def getMap(): yandexDashMapsLib.yandexDashMapsMod.Map = js.native
    def indexOf(childToFind: java.lang.String): scala.Double = js.native
    def indexOf(childToFind: yandexDashMapsLib.yandexDashMapsMod.IControl): scala.Double = js.native
    def remove(control: java.lang.String): this.type = js.native
    def remove(control: yandexDashMapsLib.yandexDashMapsMod.IControl): this.type = js.native
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - yandexDashMapsLib.yandexDashMapsMod.ICustomizable because var conflicts: events. Inlined options */ @js.native
  class RouteButton ()
    extends yandexDashMapsLib.yandexDashMapsMod.IControl {
    def this(parameters: IRouteButtonParameters) = this()
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    var options: yandexDashMapsLib.yandexDashMapsMod.IOptionManager = js.native
    var routePanel: yandexDashMapsLib.yandexDashMapsMod.IRoutePanel = js.native
    def setParent(parent: yandexDashMapsLib.yandexDashMapsMod.IControlParent): this.type = js.native
  }
  
  @js.native
  class RouteEditor () extends Button {
    def this(parameters: IRouteEditorParameters) = this()
    def getRoute(): yandexDashMapsLib.yandexDashMapsMod.routerNs.Route = js.native
  }
  
  @js.native
  class RulerControl () extends Button {
    def this(parameters: IRulerControlParameters) = this()
  }
  
  /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
  - yandexDashMapsLib.yandexDashMapsMod.ICustomizable because var conflicts: events. Inlined options */ @js.native
  class SearchControl ()
    extends yandexDashMapsLib.yandexDashMapsMod.IControl {
    def this(parameters: ISearchControlParameters) = this()
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    var options: yandexDashMapsLib.yandexDashMapsMod.IOptionManager = js.native
    var state: yandexDashMapsLib.yandexDashMapsMod.dataNs.Manager = js.native
    def clear(): scala.Unit = js.native
    def getMap(): yandexDashMapsLib.yandexDashMapsMod.Map = js.native
    def getRequestString(): java.lang.String = js.native
    def getResponseMetaData(): js.Object = js.native
    def getResult(index: scala.Double): js.Promise[js.Object] = js.native
    def getResultsArray(): js.Array[js.Object] = js.native
    def getResultsCount(): scala.Double = js.native
    def getSelectedIndex(): scala.Double = js.native
    def hideResult(): scala.Unit = js.native
    def search(request: java.lang.String): js.Promise[scala.Unit] = js.native
    def setParent(parent: yandexDashMapsLib.yandexDashMapsMod.IControlParent): this.type = js.native
    def showResult(index: scala.Double): this.type = js.native
  }
  
}

