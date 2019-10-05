package typings.winrt.Windows.Storage.Streams

import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IRandomAccessStreamStatics extends js.Object {
  def copyAndCloseAsync(source: IInputStream, destination: IOutputStream): IAsyncOperationWithProgress[Double, Double] = js.native
  def copyAsync(source: IInputStream, destination: IOutputStream): IAsyncOperationWithProgress[Double, Double] = js.native
  def copyAsync(source: IInputStream, destination: IOutputStream, bytesToCopy: Double): IAsyncOperationWithProgress[Double, Double] = js.native
}

