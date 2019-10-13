package typings.yandexDashMaps.yandexDashMapsMod

import typings.yandexDashMaps.yandexDashMapsMod.clusterer.Hint
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.yandexDashMaps.yandexDashMapsMod.IEventEmitter because Already inherited
- typings.yandexDashMaps.yandexDashMapsMod.ICustomizable because var conflicts: events. Inlined options */ @JSImport("yandex-maps", "Clusterer")
@js.native
class Clusterer ()
  extends IChild[IControlParent]
     with IParentOnMap {
  def this(options: IClustererOptions) = this()
  var balloon: typings.yandexDashMaps.yandexDashMapsMod.clusterer.Balloon = js.native
  /* CompleteClass */
  override var events: IEventManager = js.native
  // 	balloonopen:
  var hint: Hint = js.native
  var options: IOptionManager = js.native
  /* CompleteClass */
  override def getMap(): Map = js.native
  def setParent(parent: IControlParent): this.type = js.native
}

@JSImport("yandex-maps", "clusterer")
@js.native
object clusterer extends js.Object {
  @js.native
  class Balloon protected () extends IBalloonManager[Clusterer] {
    //tslint:disable-line no-shadowed-variable
    def this(clusterer: Clusterer) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
  }
  
  @js.native
  class Hint protected () extends IPopupManager[Clusterer] {
    def this(clusterer: Clusterer) = this()
    /* CompleteClass */
    override var events: IEventManager = js.native
  }
  
}

