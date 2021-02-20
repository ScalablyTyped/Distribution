package typings.winrtUwp.Windows.Storage

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** A helper object that provides indexing names for Windows media file properties. */
@js.native
trait SystemMediaProperties extends StObject {
  
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
  implicit class SystemMediaPropertiesMutableBuilder[Self <: SystemMediaProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: String): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProducer(value: String): Self = StObject.set(x, "producer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPublisher(value: String): Self = StObject.set(x, "publisher", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubTitle(value: String): Self = StObject.set(x, "subTitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWriter(value: String): Self = StObject.set(x, "writer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYear(value: String): Self = StObject.set(x, "year", value.asInstanceOf[js.Any])
  }
}
