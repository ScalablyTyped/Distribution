package typings.winrtUwp.global.Windows.Devices.AllJoyn

import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Globalization.Language
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Used to view data about another app and the device it is running on. */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynAboutDataView")
@js.native
abstract class AllJoynAboutDataView ()
  extends typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAboutDataView

/* static members */
@JSGlobal("Windows.Devices.AllJoyn.AllJoynAboutDataView")
@js.native
object AllJoynAboutDataView extends js.Object {
  /**
    * Gets the About data for a session.
    * @param uniqueName The unique name.
    * @param busAttachment The bus attachment supporting the session.
    * @param sessionPort The port used to connect to the session.
    * @return An object containing About data for the session.
    */
  def getDataBySessionPortAsync(
    uniqueName: String,
    busAttachment: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynBusAttachment,
    sessionPort: Double
  ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAboutDataView] = js.native
  /**
    * Gets the About data for a session in a particular language.
    * @param uniqueName The unique name.
    * @param busAttachment The bus attachment supporting the session.
    * @param sessionPort The port used to connect to the session.
    * @param language The language to return the descriptive data in.
    * @return An object containing About data for the session in the set language.
    */
  def getDataBySessionPortAsync(
    uniqueName: String,
    busAttachment: typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynBusAttachment,
    sessionPort: Double,
    language: Language
  ): IPromiseWithIAsyncOperation[typings.winrtUwp.Windows.Devices.AllJoyn.AllJoynAboutDataView] = js.native
}

