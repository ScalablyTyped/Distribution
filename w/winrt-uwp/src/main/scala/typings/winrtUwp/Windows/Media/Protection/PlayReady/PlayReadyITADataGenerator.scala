package typings.winrtUwp.Windows.Media.Protection.PlayReady

import typings.winrtUwp.Windows.Foundation.Collections.IPropertySet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** Creates the PlayReady ITA-specific serialized initialization data. */
@js.native
trait PlayReadyITADataGenerator extends js.Object {
  
  /**
    * Returns a serialized blob of the specified IPropertySet data that the PlayReady ITA can consume if wrapped in a content protection instantiation format.
    * @param guidCPSystemId The content protection system GUID.
    * @param countOfStreams The stream count.
    * @param configuration The data to be returned as a serialized blob.
    * @param format The format for the ITA serialized data.
    * @return The serialized blob. See Remarks.
    */
  def generateData(
    guidCPSystemId: String,
    countOfStreams: Double,
    configuration: IPropertySet,
    format: PlayReadyITADataFormat
  ): js.Array[Double] = js.native
}
object PlayReadyITADataGenerator {
  
  @scala.inline
  def apply(generateData: (String, Double, IPropertySet, PlayReadyITADataFormat) => js.Array[Double]): PlayReadyITADataGenerator = {
    val __obj = js.Dynamic.literal(generateData = js.Any.fromFunction4(generateData))
    __obj.asInstanceOf[PlayReadyITADataGenerator]
  }
  
  @scala.inline
  implicit class PlayReadyITADataGeneratorOps[Self <: PlayReadyITADataGenerator] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGenerateData(value: (String, Double, IPropertySet, PlayReadyITADataFormat) => js.Array[Double]): Self = this.set("generateData", js.Any.fromFunction4(value))
  }
}
