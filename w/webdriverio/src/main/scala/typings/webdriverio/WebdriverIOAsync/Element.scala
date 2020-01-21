package typings.webdriverio.WebdriverIOAsync

import typings.webdriverio.AsyncSelectors
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveDifficultInheritance.summarizeChanges 
- Dropped {[ K in keyof webdriverio.ElementPromise ]: (args : std.Parameters<webdriverio.ElementPromise[K]>): std.Promise<std.ReturnType<webdriverio.ElementPromise[K]>>}
- Dropped {[ P in 'addCommand' | 'selector' | 'elementId' | 'element-6066-11e4-a52e-4f735466cecf' | 'ELEMENT' | 'index' | 'parent' ]: webdriverio.WebdriverIO.Element[P]} */ @js.native
trait Element extends AsyncSelectors {
  def dragAndDrop(target: Element): js.Promise[Unit] = js.native
  def dragAndDrop(target: Element, duration: Double): js.Promise[Unit] = js.native
  def touchAction(action: TouchActions): js.Promise[Unit] = js.native
}

