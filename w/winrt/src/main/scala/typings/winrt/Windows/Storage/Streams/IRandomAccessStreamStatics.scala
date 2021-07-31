package typings.winrt.Windows.Storage.Streams

import typings.winrt.Windows.Foundation.IAsyncOperationWithProgress
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IRandomAccessStreamStatics extends StObject {
  
  def copyAndCloseAsync(source: IInputStream, destination: IOutputStream): IAsyncOperationWithProgress[Double, Double] = js.native
  
  def copyAsync(source: IInputStream, destination: IOutputStream): IAsyncOperationWithProgress[Double, Double] = js.native
  def copyAsync(source: IInputStream, destination: IOutputStream, bytesToCopy: Double): IAsyncOperationWithProgress[Double, Double] = js.native
}
