package typings.twit

import typings.twit.mod.Attachement
import typings.twit.mod.QuickReply
import typings.twit.mod.Twitter.MediaEntity
import typings.twit.twitStrings.Point
import typings.twit.twitStrings.shared_coordinate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Attachment extends StObject {
    
    var attachment: js.UndefOr[Attachement] = js.undefined
    
    var quick_reply: js.UndefOr[QuickReply] = js.undefined
    
    var text: String
  }
  object Attachment {
    
    inline def apply(text: String): Attachment = {
      val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
      __obj.asInstanceOf[Attachment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Attachment] (val x: Self) extends AnyVal {
      
      inline def setAttachment(value: Attachement): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
      
      inline def setAttachmentUndefined: Self = StObject.set(x, "attachment", js.undefined)
      
      inline def setQuick_reply(value: QuickReply): Self = StObject.set(x, "quick_reply", value.asInstanceOf[js.Any])
      
      inline def setQuick_replyUndefined: Self = StObject.set(x, "quick_reply", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    }
  }
  
  trait Code extends StObject {
    
    var code: Double
    
    var message: String
  }
  object Code {
    
    inline def apply(code: Double, message: String): Code = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
      __obj.asInstanceOf[Code]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Code] (val x: Self) extends AnyVal {
      
      inline def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    }
  }
  
  trait Coordinates extends StObject {
    
    var coordinates: js.Array[Double]
    
    var `type`: Point
  }
  object Coordinates {
    
    inline def apply(coordinates: js.Array[Double]): Coordinates = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("Point")
      __obj.asInstanceOf[Coordinates]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Coordinates] (val x: Self) extends AnyVal {
      
      inline def setCoordinates(value: js.Array[Double]): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
      
      inline def setCoordinatesVarargs(value: Double*): Self = StObject.set(x, "coordinates", js.Array(value*))
      
      inline def setType(value: Point): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait CoordinatesCoordinates extends StObject {
    
    var coordinates: Coordinates
  }
  object CoordinatesCoordinates {
    
    inline def apply(coordinates: Coordinates): CoordinatesCoordinates = {
      val __obj = js.Dynamic.literal(coordinates = coordinates.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoordinatesCoordinates]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CoordinatesCoordinates] (val x: Self) extends AnyVal {
      
      inline def setCoordinates(value: Coordinates): Self = StObject.set(x, "coordinates", value.asInstanceOf[js.Any])
    }
  }
  
  trait Id extends StObject {
    
    var id: Double
    
    var id_str: String
  }
  object Id {
    
    inline def apply(id: Double, id_str: String): Id = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], id_str = id_str.asInstanceOf[js.Any])
      __obj.asInstanceOf[Id]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Id] (val x: Self) extends AnyVal {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setId_str(value: String): Self = StObject.set(x, "id_str", value.asInstanceOf[js.Any])
    }
  }
  
  trait IdString extends StObject {
    
    var id: String
  }
  object IdString {
    
    inline def apply(id: String): IdString = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdString]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IdString] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Media extends StObject {
    
    var media: js.Array[MediaEntity]
  }
  object Media {
    
    inline def apply(media: js.Array[MediaEntity]): Media = {
      val __obj = js.Dynamic.literal(media = media.asInstanceOf[js.Any])
      __obj.asInstanceOf[Media]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Media] (val x: Self) extends AnyVal {
      
      inline def setMedia(value: js.Array[MediaEntity]): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMediaVarargs(value: MediaEntity*): Self = StObject.set(x, "media", js.Array(value*))
    }
  }
  
  trait Messagedata extends StObject {
    
    var message_data: Attachment
    
    var target: Recipientid
  }
  object Messagedata {
    
    inline def apply(message_data: Attachment, target: Recipientid): Messagedata = {
      val __obj = js.Dynamic.literal(message_data = message_data.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[Messagedata]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Messagedata] (val x: Self) extends AnyVal {
      
      inline def setMessage_data(value: Attachment): Self = StObject.set(x, "message_data", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: Recipientid): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
  
  trait Recipientid extends StObject {
    
    var recipient_id: String
  }
  object Recipientid {
    
    inline def apply(recipient_id: String): Recipientid = {
      val __obj = js.Dynamic.literal(recipient_id = recipient_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Recipientid]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Recipientid] (val x: Self) extends AnyVal {
      
      inline def setRecipient_id(value: String): Self = StObject.set(x, "recipient_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait Sharedcoordinate extends StObject {
    
    var shared_coordinate: CoordinatesCoordinates
    
    var `type`: shared_coordinate
  }
  object Sharedcoordinate {
    
    inline def apply(shared_coordinate: CoordinatesCoordinates): Sharedcoordinate = {
      val __obj = js.Dynamic.literal(shared_coordinate = shared_coordinate.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("shared_coordinate")
      __obj.asInstanceOf[Sharedcoordinate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Sharedcoordinate] (val x: Self) extends AnyVal {
      
      inline def setShared_coordinate(value: CoordinatesCoordinates): Self = StObject.set(x, "shared_coordinate", value.asInstanceOf[js.Any])
      
      inline def setType(value: shared_coordinate): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Text extends StObject {
    
    var text: js.UndefOr[String] = js.undefined
  }
  object Text {
    
    inline def apply(): Text = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Text]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Text] (val x: Self) extends AnyVal {
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    }
  }
}
