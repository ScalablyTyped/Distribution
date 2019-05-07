package typings
package yandexDashMapsLib.yandexDashMapsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yandex-maps", "map")
@js.native
object mapNs extends js.Object {
  @js.native
  class Balloon protected ()
    extends yandexDashMapsLib.yandexDashMapsMod.IBalloonManager[Balloon] {
    //tslint:disable-line no-shadowed-variable
    def this(map: yandexDashMapsLib.yandexDashMapsMod.Map) = this()
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
  }
  
  @js.native
  class Container protected ()
    extends yandexDashMapsLib.yandexDashMapsMod.IDomEventEmitter {
    def this(parentElement: java.lang.String) = this()
    def this(parentElement: stdLib.HTMLElement) = this()
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    def enterFullscreen(): scala.Unit = js.native
    def exitFullscreen(): scala.Unit = js.native
    def fitToViewport(): scala.Unit = js.native
    def fitToViewport(preservePixelPosition: scala.Boolean): scala.Unit = js.native
    def getElement(): stdLib.HTMLElement = js.native
    def getOffset(): js.Array[scala.Double] = js.native
    def getParentElement(): stdLib.HTMLElement = js.native
    def getSize(): js.Array[scala.Double] = js.native
    def isFullscreen(): scala.Boolean = js.native
  }
  
  @js.native
  class Converter protected () extends js.Object {
    def this(map: yandexDashMapsLib.yandexDashMapsMod.Map) = this()
    def globalToPage(globalPixelPoint: js.Array[scala.Double]): js.Array[scala.Double] = js.native
    def pageToGlobal(pagePixelPoint: js.Array[scala.Double]): js.Array[scala.Double] = js.native
  }
  
  @js.native
  class Copyrights protected () extends js.Object {
    def this(map: yandexDashMapsLib.yandexDashMapsMod.Map) = this()
    def add(customCopyrights: java.lang.String): yandexDashMapsLib.yandexDashMapsMod.ICopyrightsAccessor = js.native
    def add(customCopyrights: js.Array[java.lang.String | stdLib.HTMLElement]): yandexDashMapsLib.yandexDashMapsMod.ICopyrightsAccessor = js.native
    def add(customCopyrights: stdLib.HTMLElement): yandexDashMapsLib.yandexDashMapsMod.ICopyrightsAccessor = js.native
    def addProvider(provider: yandexDashMapsLib.yandexDashMapsMod.ICopyrightsProvider): this.type = js.native
    def get(): js.Promise[js.Array[java.lang.String | stdLib.HTMLElement]] = js.native
    def get(point: js.Array[scala.Double]): js.Promise[js.Array[java.lang.String | stdLib.HTMLElement]] = js.native
    def get(point: js.Array[scala.Double], zoom: scala.Double): js.Promise[js.Array[java.lang.String | stdLib.HTMLElement]] = js.native
    def getPromoLink(): java.lang.String = js.native
    def removeProvider(provider: yandexDashMapsLib.yandexDashMapsMod.ICopyrightsProvider): this.type = js.native
  }
  
  @js.native
  class GeoObjects protected ()
    extends yandexDashMapsLib.yandexDashMapsMod.IGeoObjectCollection {
    def this(map: yandexDashMapsLib.yandexDashMapsMod.Map) = this()
    def this(map: yandexDashMapsLib.yandexDashMapsMod.Map, options: js.Object) = this()
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    /* CompleteClass */
    override var options: yandexDashMapsLib.yandexDashMapsMod.IOptionManager = js.native
    /* CompleteClass */
    override def getMap(): yandexDashMapsLib.yandexDashMapsMod.Map = js.native
  }
  
  @js.native
  class Hint protected ()
    extends yandexDashMapsLib.yandexDashMapsMod.IHintManager[Hint] {
    def this(map: yandexDashMapsLib.yandexDashMapsMod.Map) = this()
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
  }
  
  @js.native
  class ZoomRange protected ()
    extends yandexDashMapsLib.yandexDashMapsMod.IEventEmitter {
    def this(map: yandexDashMapsLib.yandexDashMapsMod.Map, constraints: js.Array[scala.Double]) = this()
    /* CompleteClass */
    override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
    def get(): js.Promise[js.Array[scala.Double]] = js.native
    def get(coords: js.Array[scala.Double]): js.Promise[js.Array[scala.Double]] = js.native
    def getCurrent(): js.Array[scala.Double] = js.native
  }
  
  @JSName("action")
  @js.native
  object actionNs extends js.Object {
    @js.native
    class Manager protected ()
      extends yandexDashMapsLib.yandexDashMapsMod.IEventEmitter {
      def this(map: yandexDashMapsLib.yandexDashMapsMod.Map) = this()
      /* CompleteClass */
      override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
      def breakTick(): scala.Unit = js.native
      def execute(action: yandexDashMapsLib.yandexDashMapsMod.IMapAction): scala.Unit = js.native
      def getCurrentState(): js.Object = js.native
      def getMap(): yandexDashMapsLib.yandexDashMapsMod.Map = js.native
      def setCorrection(userFunction: js.Function0[scala.Unit]): scala.Unit = js.native
      def stop(): scala.Unit = js.native
    }
    
  }
  
  @JSName("behavior")
  @js.native
  object behaviorNs extends js.Object {
    //tslint:disable-line no-shadowed-variable
    @js.native
    class Manager protected ()
      extends yandexDashMapsLib.yandexDashMapsMod.ICustomizable
         with yandexDashMapsLib.yandexDashMapsMod.IParentOnMap {
      def this(map: yandexDashMapsLib.yandexDashMapsMod.Map) = this()
      def this(map: yandexDashMapsLib.yandexDashMapsMod.Map, behaviors: js.Array[js.Array[java.lang.String] | java.lang.String]) = this()
      def this(map: yandexDashMapsLib.yandexDashMapsMod.Map, behaviors: js.Array[js.Array[java.lang.String] | java.lang.String], options: js.Object) = this()
      /* CompleteClass */
      override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
      /* CompleteClass */
      override var options: yandexDashMapsLib.yandexDashMapsMod.IOptionManager = js.native
      def disable(behaviors: java.lang.String): this.type = js.native
      def disable(behaviors: js.Array[js.Array[java.lang.String] | java.lang.String]): this.type = js.native
      def enable(behaviors: java.lang.String): this.type = js.native
      def enable(behaviors: js.Array[js.Array[java.lang.String] | java.lang.String]): this.type = js.native
      def get(behaviorName: java.lang.String): yandexDashMapsLib.yandexDashMapsMod.IBehavior = js.native
      /* CompleteClass */
      override def getMap(): yandexDashMapsLib.yandexDashMapsMod.Map = js.native
      def isEnabled(behaviorName: java.lang.String): scala.Boolean = js.native
    }
    
  }
  
  @JSName("layer")
  @js.native
  object layerNs extends js.Object {
    /* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
    - yandexDashMapsLib.yandexDashMapsMod.ILayer because var conflicts: events, options. Inlined getBrightness, getCopyrights, getZoomRange */ @js.native
    class Manager protected ()
      extends yandexDashMapsLib.yandexDashMapsMod.IMapObjectCollection {
      def this(map: yandexDashMapsLib.yandexDashMapsMod.Map) = this()
      def this(map: yandexDashMapsLib.yandexDashMapsMod.Map, options: yandexDashMapsLib.Anon_TrafficImageZIndex) = this()
      /* CompleteClass */
      override var events: yandexDashMapsLib.yandexDashMapsMod.IEventManager = js.native
      var getBrightness: js.UndefOr[js.Function0[scala.Double]] = js.native
      var getCopyrights: js.UndefOr[
            js.Function2[
              /* coords */ js.Array[scala.Double], 
              /* zoom */ scala.Double, 
              js.Promise[js.Array[java.lang.String | stdLib.HTMLElement]]
            ]
          ] = js.native
      var getZoomRange: js.UndefOr[
            js.Function1[/* point */ js.Array[scala.Double], js.Promise[js.Array[scala.Double]]]
          ] = js.native
      /* CompleteClass */
      override var options: yandexDashMapsLib.yandexDashMapsMod.IOptionManager = js.native
      /* CompleteClass */
      override def add(`object`: js.Object): this.type = js.native
      def each(callback: js.Function1[/* layer */ yandexDashMapsLib.yandexDashMapsMod.ILayer, scala.Unit]): scala.Unit = js.native
      def each(
        callback: js.Function1[/* layer */ yandexDashMapsLib.yandexDashMapsMod.ILayer, scala.Unit],
        context: js.Object
      ): scala.Unit = js.native
      /* CompleteClass */
      override def getIterator(): yandexDashMapsLib.yandexDashMapsMod.IIterator = js.native
      /* CompleteClass */
      override def getMap(): yandexDashMapsLib.yandexDashMapsMod.Map = js.native
      def getParent(): scala.Null | yandexDashMapsLib.yandexDashMapsMod.IControlParent = js.native
      /* CompleteClass */
      override def remove(`object`: js.Object): this.type = js.native
      def setParent(parent: yandexDashMapsLib.yandexDashMapsMod.IControlParent): this.type = js.native
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
      def this(map: yandexDashMapsLib.yandexDashMapsMod.Map) = this()
      def addArea(screenArea: js.Object): Accessor = js.native
      def destroy(): this.type = js.native
      def getMargin(): js.Array[scala.Double] = js.native
      def getOffset(): js.Array[scala.Double] = js.native
      def setDefaultMargin(margin: js.Array[js.Array[scala.Double] | scala.Double]): scala.Unit = js.native
      def setDefaultMargin(margin: scala.Double): scala.Unit = js.native
    }
    
  }
  
  @JSName("pane")
  @js.native
  object paneNs extends js.Object {
    @js.native
    class Manager protected () extends js.Object {
      def this(map: yandexDashMapsLib.yandexDashMapsMod.Map) = this()
      def append(key: java.lang.String, pane: yandexDashMapsLib.yandexDashMapsMod.IPane): scala.Unit = js.native
      def destroy(): scala.Unit = js.native
      def get(key: java.lang.String): yandexDashMapsLib.yandexDashMapsMod.IPane | scala.Null = js.native
      def getLower(): java.lang.String = js.native
      def getUpper(): java.lang.String = js.native
      def insertBefore(
        key: java.lang.String,
        pane: yandexDashMapsLib.yandexDashMapsMod.IPane,
        referenceKey: java.lang.String
      ): scala.Unit = js.native
      def remove(pane: yandexDashMapsLib.yandexDashMapsMod.IPane): scala.Unit = js.native
    }
    
  }
  
}

