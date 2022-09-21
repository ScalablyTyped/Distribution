package typings.winrtUwp.Windows.Devices.PointOfService

import typings.winrtUwp.Windows.Foundation.Collections.IIterable
import typings.winrtUwp.Windows.Foundation.Collections.IVectorView
import typings.winrtUwp.Windows.Foundation.EventHandler
import typings.winrtUwp.Windows.Foundation.IPromiseWithIAsyncOperation
import typings.winrtUwp.Windows.Foundation.TypedEventHandler
import typings.winrtUwp.Windows.WinRTEvent
import typings.winrtUwp.winrtUwpStrings.statusupdated
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Represents a point-of-service printer. */
@js.native
trait PosPrinter extends StObject {
  
  def addEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_statusupdated(`type`: statusupdated, listener: TypedEventHandler[PosPrinter, PosPrinterStatusUpdatedEventArgs]): Unit = js.native
  
  /** Gets the capabilities of the point-of-service printer. */
  var capabilities: PosPrinterCapabilities = js.native
  
  /**
    * Gets the health state of the point-of-service printer asynchronously.
    * @param level The type of health check that you want to perform for the point-of-service printer. Only level POSInternal(1) should be used, as any other UnifiedPosHealthCheckLevel levels will result in an error.
    * @return An asynchronous operation that returns the health state of the point-of-service printer. You should display this value in the app interface immediately so the user of the app can interpret the value. For example, the operation returns “OK” as the health state if the state of the point-of-service printer is good.
    */
  def checkHealthAsync(level: UnifiedPosHealthCheckLevel): IPromiseWithIAsyncOperation[String] = js.native
  
  /**
    * Claims the point-of-service printer for use, and gets an instance of the ClaimedPosPrinter class for the point-of-service printer.
    * @return The claimed point-of-service printer.
    */
  def claimPrinterAsync(): IPromiseWithIAsyncOperation[ClaimedPosPrinter] = js.native
  
  /** Gets the identifier of the point-of-service printer. */
  var deviceId: String = js.native
  
  /**
    * Gets the specified statistics from the point-of-service printer.
    * @param statisticsCategories The list of statistics to retrieve.
    * @return The requested statistics.
    */
  def getStatisticsAsync(statisticsCategories: IIterable[String]): IPromiseWithIAsyncOperation[String] = js.native
  
  /** Occurs when the status of the power or availability of the point-of-service printer changes. */
  def onstatusupdated(ev: PosPrinterStatusUpdatedEventArgs & WinRTEvent[PosPrinter]): Unit = js.native
  /** Occurs when the status of the power or availability of the point-of-service printer changes. */
  @JSName("onstatusupdated")
  var onstatusupdated_Original: TypedEventHandler[PosPrinter, PosPrinterStatusUpdatedEventArgs] = js.native
  
  def removeEventListener(`type`: String, listener: EventHandler[Any]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_statusupdated(`type`: statusupdated, listener: TypedEventHandler[PosPrinter, PosPrinterStatusUpdatedEventArgs]): Unit = js.native
  
  /** Gets the current status of the power and availability of the point-of-service printer. */
  var status: PosPrinterStatus = js.native
  
  /** Gets the list of character sets that the point-of-service printer supports. */
  var supportedCharacterSets: IVectorView[Double] = js.native
  
  /** Gets the fonts and typefaces that the point-of-service printer supports. */
  var supportedTypeFaces: IVectorView[String] = js.native
}
