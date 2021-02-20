package typings.titanium

import typings.titanium.Titanium.Blob
import typings.titanium.Titanium.Buffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Argument passed to [createStream](Titanium.Stream.createStream).
  */
@js.native
trait CreateStreamArgs extends StObject {
  
  /**
    * Mode to open the stream in.
    */
  var mode: js.UndefOr[Double] = js.native
  
  /**
    * Object that the stream will read from or write to.
    */
  var source: js.UndefOr[Blob | Buffer] = js.native
}
object CreateStreamArgs {
  
  @scala.inline
  def apply(): CreateStreamArgs = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateStreamArgs]
  }
  
  @scala.inline
  implicit class CreateStreamArgsMutableBuilder[Self <: CreateStreamArgs] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMode(value: Double): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
    
    @scala.inline
    def setSource(value: Blob | Buffer): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSourceUndefined: Self = StObject.set(x, "source", js.undefined)
  }
}
