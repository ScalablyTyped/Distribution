package typings.winrtUwp.Windows.Storage

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A helper object that provides indexing names for Windows media file properties. */
@js.native
trait SystemMediaProperties extends js.Object {
  
  /** Gets the name of the System.Media.Duration property (one of the Windows media file properties). */
  var duration: String = js.native
  
  /** Gets the name of the System.Media.Producer property (one of the Windows media file properties). */
  var producer: String = js.native
  
  /** Gets the name of the System.Media.Publisher property (one of the Windows media file properties). */
  var publisher: String = js.native
  
  /** Gets the name of the System.Media.SubTitle property (one of the Windows media file properties). */
  var subTitle: String = js.native
  
  /** Gets the name of the System.Media.Writer property (one of the Windows media file properties). */
  var writer: String = js.native
  
  /** Gets the name of the System.Media.Year property (one of the Windows media file properties). */
  var year: String = js.native
}
object SystemMediaProperties {
  
  @scala.inline
  def apply(
    duration: String,
    producer: String,
    publisher: String,
    subTitle: String,
    writer: String,
    year: String
  ): SystemMediaProperties = {
    val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], producer = producer.asInstanceOf[js.Any], publisher = publisher.asInstanceOf[js.Any], subTitle = subTitle.asInstanceOf[js.Any], writer = writer.asInstanceOf[js.Any], year = year.asInstanceOf[js.Any])
    __obj.asInstanceOf[SystemMediaProperties]
  }
  
  @scala.inline
  implicit class SystemMediaPropertiesOps[Self <: SystemMediaProperties] (val x: Self) extends AnyVal {
    
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
    def setDuration(value: String): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducer(value: String): Self = this.set("producer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisher(value: String): Self = this.set("publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTitle(value: String): Self = this.set("subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriter(value: String): Self = this.set("writer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYear(value: String): Self = this.set("year", value.asInstanceOf[js.Any])
  }
}
