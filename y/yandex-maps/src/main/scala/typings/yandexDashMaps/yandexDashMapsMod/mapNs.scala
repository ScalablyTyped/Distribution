package typings.yandexDashMaps.yandexDashMapsMod

import typings.std.HTMLElement
import typings.yandexDashMaps.Anon_TrafficImageZIndex
import typings.yandexDashMaps.yandexDashMapsMod.mapNs.Hint
import typings.yandexDashMaps.yandexDashMapsMod.mapNs.marginNs.Accessor
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "map")
@js.native
object mapNs extends js.Object {
  @js.native
  class Balloon protected ()
    extends IBalloonManager[typings.yandexDashMaps.yandexDashMapsMod.mapNs.Balloon] {
    //tslint:disable-line no-shadowed-variable
    def this(map: Map) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
  }
  
  @js.native
  class Container protected () extends IDomEventEmitter {
    def this(parentElement: String) = this()
    def this(parentElement: HTMLElement) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
    def enterFullscreen(): Unit = js.native
    def exitFullscreen(): Unit = js.native
    def fitToViewport(): Unit = js.native
    def fitToViewport(preservePixelPosition: Boolean): Unit = js.native
    def getElement(): HTMLElement = js.native
    def getOffset(): js.Array[Double] = js.native
    def getParentElement(): HTMLElement = js.native
    def getSize(): js.Array[Double] = js.native
    def isFullscreen(): Boolean = js.native
  }
  
  @js.native
  class Converter protected () extends js.Object {
    def this(map: Map) = this()
    def globalToPage(globalPixelPoint: js.Array[Double]): js.Array[Double] = js.native
    def pageToGlobal(pagePixelPoint: js.Array[Double]): js.Array[Double] = js.native
  }
  
  @js.native
  class Copyrights protected () extends js.Object {
    def this(map: Map) = this()
    def add(customCopyrights: String): ICopyrightsAccessor = js.native
    def add(customCopyrights: js.Array[String | HTMLElement]): ICopyrightsAccessor = js.native
    def add(customCopyrights: HTMLElement): ICopyrightsAccessor = js.native
    def addProvider(provider: ICopyrightsProvider): this.type = js.native
    def get(): js.Promise[js.Array[String | HTMLElement]] = js.native
    def get(point: js.Array[Double]): js.Promise[js.Array[String | HTMLElement]] = js.native
    def get(point: js.Array[Double], zoom: Double): js.Promise[js.Array[String | HTMLElement]] = js.native
    def getPromoLink(): String = js.native
    def removeProvider(provider: ICopyrightsProvider): this.type = js.native
  }
  
  @js.native
  class GeoObjects protected () extends IGeoObjectCollection {
    def this(map: Map) = this()
    def this(map: Map, options: js.Object) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
    /* CompleteClass */
    override var options: IOptionManager = js.native
    /* CompleteClass */
    override def getMap(): Map = js.native
  }
  
  @js.native
  class Hint protected () extends IHintManager[Hint] {
    def this(map: Map) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
  }
  
  @js.native
  class ZoomRange protected () extends IEventEmitter {
    def this(map: Map, constraints: js.Array[Double]) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
    def get(): js.Promise[js.Array[Double]] = js.native
    def get(coords: js.Array[Double]): js.Promise[js.Array[Double]] = js.native
    def getCurrent(): js.Array[Double] = js.native
  }
  
  @JSName("action")
  @js.native
  object actionNs extends js.Object {
    @js.native
    class Manager protected () extends IEventEmitter {
      def this(map: Map) = this()
      /* CompleteClass */
      override var events: IEventManager = js.native
      def breakTick(): Unit = js.native
      def execute(action: IMapAction): Unit = js.native
      def getCurrentState(): js.Object = js.native
      def getMap(): Map = js.native
      def setCorrection(userFunction: js.Function0[Unit]): Unit = js.native
      def stop(): Unit = js.native
    }
    
  }
  
  @JSName("behavior")
  @js.native
  object behaviorNs extends js.Object {
    //tslint:disable-line no-shadowed-variable
    @js.native
    class Manager protected ()
      extends ICustomizable
         with IParentOnMap {
      def this(map: Map) = this()
      def this(map: Map, behaviors: js.Array[js.Array[String] | String]) = this()
      def this(map: Map, behaviors: js.Array[js.Array[String] | String], options: js.Object) = this()
      /* CompleteClass */
      override var events: IEventManager = js.native
      /* CompleteClass */
      override var options: IOptionManager = js.native
      def disable(behaviors: String): this.type = js.native
      def disable(behaviors: js.Array[js.Array[String] | String]): this.type = js.native
      def enable(behaviors: String): this.type = js.native
      def enable(behaviors: js.Array[js.Array[String] | String]): this.type = js.native
      def get(behaviorName: String): IBehavior = js.native
      /* CompleteClass */
      override def getMap(): Map = js.native
      def isEnabled(behaviorName: String): Boolean = js.native
    }
    
  }
  
  @JSName("layer")
  @js.native
  object layerNs extends js.Object {
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - typings.yandexDashMaps.yandexDashMapsMod.ILayer because var conflicts: events, options. Inlined getBrightness, getCopyrights, getZoomRange */ @js.native
    class Manager protected () extends IMapObjectCollection {
      def this(map: Map) = this()
      def this(map: Map, options: Anon_TrafficImageZIndex) = this()
      /* CompleteClass */
      override var events: IEventManager = js.native
      var getBrightness: js.UndefOr[js.Function0[Double]] = js.native
      var getCopyrights: js.UndefOr[
            js.Function2[
              /* coords */ js.Array[Double], 
              /* zoom */ Double, 
              js.Promise[js.Array[String | HTMLElement]]
            ]
          ] = js.native
      var getZoomRange: js.UndefOr[js.Function1[/* point */ js.Array[Double], js.Promise[js.Array[Double]]]] = js.native
      /* CompleteClass */
      override var options: IOptionManager = js.native
      /* CompleteClass */
      override def add(`object`: js.Object): this.type = js.native
      def each(callback: js.Function1[/* layer */ ILayer, Unit]): Unit = js.native
      def each(callback: js.Function1[/* layer */ ILayer, Unit], context: js.Object): Unit = js.native
      /* CompleteClass */
      override def getIterator(): IIterator = js.native
      /* CompleteClass */
      override def getMap(): Map = js.native
      def getParent(): Null | IControlParent = js.native
      /* CompleteClass */
      override def remove(`object`: js.Object): this.type = js.native
      def setParent(parent: IControlParent): this.type = js.native
    }
    
  }
  
  @JSName("margin")
  @js.native
  object marginNs extends js.Object {
    @js.native
    class Accessor protected () extends js.Object {
      def this(screenArea: js.Object) = this()
      def getArea(): js.Object = js.native
      def remove(): this.type = js.native
      def setArea(screenArea: js.Object): this.type = js.native
    }
    
    @js.native
    class Manager protected () extends js.Object {
      def this(map: Map) = this()
      def addArea(screenArea: js.Object): Accessor = js.native
      def destroy(): this.type = js.native
      def getMargin(): js.Array[Double] = js.native
      def getOffset(): js.Array[Double] = js.native
      def setDefaultMargin(margin: js.Array[js.Array[Double] | Double]): Unit = js.native
      def setDefaultMargin(margin: Double): Unit = js.native
    }
    
  }
  
  @JSName("pane")
  @js.native
  object paneNs extends js.Object {
    @js.native
    class Manager protected () extends js.Object {
      def this(map: Map) = this()
      def append(key: String, pane: IPane): Unit = js.native
      def destroy(): Unit = js.native
      def get(key: String): IPane | Null = js.native
      def getLower(): String = js.native
      def getUpper(): String = js.native
      def insertBefore(key: String, pane: IPane, referenceKey: String): Unit = js.native
      def remove(pane: IPane): Unit = js.native
    }
    
  }
  
}

