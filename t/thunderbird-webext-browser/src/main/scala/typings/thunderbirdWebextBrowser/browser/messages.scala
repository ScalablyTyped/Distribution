package typings.thunderbirdWebextBrowser.browser

import org.scalablytyped.runtime.StringDictionary
import typings.thunderbirdWebextBrowser.browser.extensionTypes.Date
import typings.thunderbirdWebextBrowser.browser.folders.MailFolder
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object messages {
  
  trait MessageAttachment extends StObject {
    
    /** The content type of the attachment. */
    var contentType: String
    
    /** A MessageHeader, if this attachment is a message. */
    var message: js.UndefOr[MessageHeader] = js.undefined
    
    /**
      * The name, as displayed to the user, of this attachment. This is
      * usually but not always the filename of the attached file.
      */
    var name: String
    
    /**
      * Identifies the MIME part of the message associated with this
      * attachment.
      */
    var partName: String
    
    /** The size in bytes of this attachment. */
    var size: Double
  }
  object MessageAttachment {
    
    inline def apply(contentType: String, name: String, partName: String, size: Double): MessageAttachment = {
      val __obj = js.Dynamic.literal(contentType = contentType.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], partName = partName.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageAttachment]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageAttachment] (val x: Self) extends AnyVal {
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: MessageHeader): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setMessageUndefined: Self = StObject.set(x, "message", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPartName(value: String): Self = StObject.set(x, "partName", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait MessageHeader extends StObject {
    
    var author: String
    
    /** The Bcc recipients. Not populated for news/nntp messages. */
    var bccList: js.Array[String]
    
    /** The Cc recipients. Not populated for news/nntp messages. */
    var ccList: js.Array[String]
    
    var date: Date
    
    /**
      * Whether this message is a real message or an external message (opened
      * from a file or from an attachment).
      */
    var external: Boolean
    
    /** Whether this message is flagged (a.k.a. starred). */
    var flagged: Boolean
    
    /**
      * The <permission>accountsRead</permission> permission is required for
      * this property to be included. Not available for external or attached
      * messages.
      */
    var folder: js.UndefOr[MailFolder] = js.undefined
    
    /** The message-id header of the message. */
    var headerMessageId: String
    
    /**
      * Some account types (for example `pop3`) allow to download only the
      * headers of the message, but not its body. The body of such messages
      * will not be available.
      */
    var headersOnly: Boolean
    
    var id: Double
    
    /**
      * Whether the message has been marked as junk. Always `false` for
      * news/nntp messages and external messages.
      */
    var junk: Boolean
    
    /**
      * The junk score associated with the message. Always `0` for news/nntp
      * messages and external messages.
      */
    var junkScore: Double
    
    /** Whether the message has been received recently and is marked as new. */
    var `new`: Boolean
    
    /**
      * Whether the message has been marked as read. Not available for
      * external or attached messages.
      */
    var read: js.UndefOr[Boolean] = js.undefined
    
    /** The To recipients. Not populated for news/nntp messages. */
    var recipients: js.Array[String]
    
    /** The total size of the message in bytes. */
    var size: Double
    
    /** The subject of the message. */
    var subject: String
    
    /**
      * Tags associated with this message. For a list of available tags, call
      * the listTags method.
      */
    var tags: js.Array[String]
  }
  object MessageHeader {
    
    inline def apply(
      author: String,
      bccList: js.Array[String],
      ccList: js.Array[String],
      date: Date,
      external: Boolean,
      flagged: Boolean,
      headerMessageId: String,
      headersOnly: Boolean,
      id: Double,
      junk: Boolean,
      junkScore: Double,
      `new`: Boolean,
      recipients: js.Array[String],
      size: Double,
      subject: String,
      tags: js.Array[String]
    ): MessageHeader = {
      val __obj = js.Dynamic.literal(author = author.asInstanceOf[js.Any], bccList = bccList.asInstanceOf[js.Any], ccList = ccList.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], external = external.asInstanceOf[js.Any], flagged = flagged.asInstanceOf[js.Any], headerMessageId = headerMessageId.asInstanceOf[js.Any], headersOnly = headersOnly.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], junk = junk.asInstanceOf[js.Any], junkScore = junkScore.asInstanceOf[js.Any], recipients = recipients.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], subject = subject.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.updateDynamic("new")(`new`.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageHeader]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageHeader] (val x: Self) extends AnyVal {
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setBccList(value: js.Array[String]): Self = StObject.set(x, "bccList", value.asInstanceOf[js.Any])
      
      inline def setBccListVarargs(value: String*): Self = StObject.set(x, "bccList", js.Array(value*))
      
      inline def setCcList(value: js.Array[String]): Self = StObject.set(x, "ccList", value.asInstanceOf[js.Any])
      
      inline def setCcListVarargs(value: String*): Self = StObject.set(x, "ccList", js.Array(value*))
      
      inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setExternal(value: Boolean): Self = StObject.set(x, "external", value.asInstanceOf[js.Any])
      
      inline def setFlagged(value: Boolean): Self = StObject.set(x, "flagged", value.asInstanceOf[js.Any])
      
      inline def setFolder(value: MailFolder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
      
      inline def setHeaderMessageId(value: String): Self = StObject.set(x, "headerMessageId", value.asInstanceOf[js.Any])
      
      inline def setHeadersOnly(value: Boolean): Self = StObject.set(x, "headersOnly", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setJunk(value: Boolean): Self = StObject.set(x, "junk", value.asInstanceOf[js.Any])
      
      inline def setJunkScore(value: Double): Self = StObject.set(x, "junkScore", value.asInstanceOf[js.Any])
      
      inline def setNew(value: Boolean): Self = StObject.set(x, "new", value.asInstanceOf[js.Any])
      
      inline def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      inline def setRecipients(value: js.Array[String]): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
      
      inline def setRecipientsVarargs(value: String*): Self = StObject.set(x, "recipients", js.Array(value*))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
  
  trait MessageList extends StObject {
    
    var id: js.UndefOr[String] = js.undefined
    
    var messages: js.Array[MessageHeader]
  }
  object MessageList {
    
    inline def apply(messages: js.Array[MessageHeader]): MessageList = {
      val __obj = js.Dynamic.literal(messages = messages.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageList]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageList] (val x: Self) extends AnyVal {
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setMessages(value: js.Array[MessageHeader]): Self = StObject.set(x, "messages", value.asInstanceOf[js.Any])
      
      inline def setMessagesVarargs(value: MessageHeader*): Self = StObject.set(x, "messages", js.Array(value*))
    }
  }
  
  trait MessagePart extends StObject {
    
    /** The content of the part */
    var body: js.UndefOr[String] = js.undefined
    
    var contentType: js.UndefOr[String] = js.undefined
    
    /**
      * A _dictionary object_ of part headers as _key-value_ pairs, with the
      * header name as _key_, and an array of headers as _value_
      */
    var headers: js.UndefOr[StringDictionary[js.Array[String]]] = js.undefined
    
    /** Name of the part, if it is a file */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The identifier of this part, used in {@link messages.getAttachmentFile}
      *
      */
    var partName: js.UndefOr[String] = js.undefined
    
    /** Any sub-parts of this part */
    var parts: js.UndefOr[js.Array[MessagePart]] = js.undefined
    
    /**
      * The size of this part. The size of _message/\*_ parts is not the
      * actual message size (on disc), but the total size of its decoded body
      * parts, excluding headers.
      */
    var size: js.UndefOr[Double] = js.undefined
  }
  object MessagePart {
    
    inline def apply(): MessagePart = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessagePart]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessagePart] (val x: Self) extends AnyVal {
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setContentType(value: String): Self = StObject.set(x, "contentType", value.asInstanceOf[js.Any])
      
      inline def setContentTypeUndefined: Self = StObject.set(x, "contentType", js.undefined)
      
      inline def setHeaders(value: StringDictionary[js.Array[String]]): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPartName(value: String): Self = StObject.set(x, "partName", value.asInstanceOf[js.Any])
      
      inline def setPartNameUndefined: Self = StObject.set(x, "partName", js.undefined)
      
      inline def setParts(value: js.Array[MessagePart]): Self = StObject.set(x, "parts", value.asInstanceOf[js.Any])
      
      inline def setPartsUndefined: Self = StObject.set(x, "parts", js.undefined)
      
      inline def setPartsVarargs(value: MessagePart*): Self = StObject.set(x, "parts", js.Array(value*))
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait MessageProperties extends StObject {
    
    /** Whether the message is flagged (a.k.a starred). */
    var flagged: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the message is marked as junk. Only supported in {@link messages.update}
      *
      */
    var junk: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the message is marked as new. Only supported in {@link messages.import}
      *
      */
    var `new`: js.UndefOr[Boolean] = js.undefined
    
    /** Whether the message is marked as read. */
    var read: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Tags associated with this message. For a list of available tags, call
      * the listTags method.
      */
    var tags: js.UndefOr[js.Array[String]] = js.undefined
  }
  object MessageProperties {
    
    inline def apply(): MessageProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[MessageProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageProperties] (val x: Self) extends AnyVal {
      
      inline def setFlagged(value: Boolean): Self = StObject.set(x, "flagged", value.asInstanceOf[js.Any])
      
      inline def setFlaggedUndefined: Self = StObject.set(x, "flagged", js.undefined)
      
      inline def setJunk(value: Boolean): Self = StObject.set(x, "junk", value.asInstanceOf[js.Any])
      
      inline def setJunkUndefined: Self = StObject.set(x, "junk", js.undefined)
      
      inline def setNew(value: Boolean): Self = StObject.set(x, "new", value.asInstanceOf[js.Any])
      
      inline def setNewUndefined: Self = StObject.set(x, "new", js.undefined)
      
      inline def setRead(value: Boolean): Self = StObject.set(x, "read", value.asInstanceOf[js.Any])
      
      inline def setReadUndefined: Self = StObject.set(x, "read", js.undefined)
      
      inline def setTags(value: js.Array[String]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setTagsVarargs(value: String*): Self = StObject.set(x, "tags", js.Array(value*))
    }
  }
  
  trait MessageTag extends StObject {
    
    /** Tag color. */
    var color: String
    
    /** Unique tag identifier. */
    var key: String
    
    /** Custom sort string (usually empty). */
    var ordinal: String
    
    /** Human-readable tag name. */
    var tag: String
  }
  object MessageTag {
    
    inline def apply(color: String, key: String, ordinal: String, tag: String): MessageTag = {
      val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], ordinal = ordinal.asInstanceOf[js.Any], tag = tag.asInstanceOf[js.Any])
      __obj.asInstanceOf[MessageTag]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MessageTag] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setOrdinal(value: String): Self = StObject.set(x, "ordinal", value.asInstanceOf[js.Any])
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
    }
  }
  
  trait QueryQueryInfo extends StObject {
    
    /** If specified, returns only messages with or without attachments. */
    var attachment: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Returns only messages with this value matching the author. The search
      * value is a single email address, a name or a combination (e.g.:
      * `Name <user@domain.org></user@domain.org>`). The address part of the
      * search value (if provided) must match the author's address completely.
      * The name part of the search value (if provided) must match the
      * author's name partially. All matches are done case-insensitive.
      */
    var author: js.UndefOr[String] = js.undefined
    
    /** Returns only messages with this value in the body of the mail. */
    var body: js.UndefOr[String] = js.undefined
    
    /** Returns only flagged (or unflagged if false) messages. */
    var flagged: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Returns only messages from the specified folder. The
      * <permission>accountsRead</permission> permission is required.
      */
    var folder: js.UndefOr[MailFolder] = js.undefined
    
    /** Returns only messages with a date after this value. */
    var fromDate: js.UndefOr[Date] = js.undefined
    
    /**
      * Returns only messages with the author's address matching any
      * configured identity.
      */
    var fromMe: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Returns only messages with this value somewhere in the mail (subject,
      * body or author).
      */
    var fullText: js.UndefOr[String] = js.undefined
    
    /** Returns only messages with a Message-ID header matching this value. */
    var headerMessageId: js.UndefOr[String] = js.undefined
    
    /** Search the folder specified by `queryInfo.folder` recursively. */
    var includeSubFolders: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Returns only messages whose recipients match all specified addresses.
      * The search value is a semicolon separated list of email addresses,
      * names or combinations (e.g.:
      * `Name <user@domain.org></user@domain.org>`). For a match, all
      * specified addresses must equal a recipient's address completely and
      * all specified names must match a recipient's name partially. All
      * matches are done case-insensitive.
      */
    var recipients: js.UndefOr[String] = js.undefined
    
    /** Returns only messages with this value matching the subject. */
    var subject: js.UndefOr[String] = js.undefined
    
    /**
      * Returns only messages with the specified tags. For a list of available
      * tags, call the {@link messages.listTags} method.
      */
    var tags: js.UndefOr[TagsDetail] = js.undefined
    
    /** Returns only messages with a date before this value. */
    var toDate: js.UndefOr[Date] = js.undefined
    
    /**
      * Returns only messages with at least one recipient address matching any
      * configured identity.
      */
    var toMe: js.UndefOr[Boolean] = js.undefined
    
    /** Returns only unread (or read if false) messages. */
    var unread: js.UndefOr[Boolean] = js.undefined
  }
  object QueryQueryInfo {
    
    inline def apply(): QueryQueryInfo = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QueryQueryInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QueryQueryInfo] (val x: Self) extends AnyVal {
      
      inline def setAttachment(value: Boolean): Self = StObject.set(x, "attachment", value.asInstanceOf[js.Any])
      
      inline def setAttachmentUndefined: Self = StObject.set(x, "attachment", js.undefined)
      
      inline def setAuthor(value: String): Self = StObject.set(x, "author", value.asInstanceOf[js.Any])
      
      inline def setAuthorUndefined: Self = StObject.set(x, "author", js.undefined)
      
      inline def setBody(value: String): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setFlagged(value: Boolean): Self = StObject.set(x, "flagged", value.asInstanceOf[js.Any])
      
      inline def setFlaggedUndefined: Self = StObject.set(x, "flagged", js.undefined)
      
      inline def setFolder(value: MailFolder): Self = StObject.set(x, "folder", value.asInstanceOf[js.Any])
      
      inline def setFolderUndefined: Self = StObject.set(x, "folder", js.undefined)
      
      inline def setFromDate(value: Date): Self = StObject.set(x, "fromDate", value.asInstanceOf[js.Any])
      
      inline def setFromDateUndefined: Self = StObject.set(x, "fromDate", js.undefined)
      
      inline def setFromMe(value: Boolean): Self = StObject.set(x, "fromMe", value.asInstanceOf[js.Any])
      
      inline def setFromMeUndefined: Self = StObject.set(x, "fromMe", js.undefined)
      
      inline def setFullText(value: String): Self = StObject.set(x, "fullText", value.asInstanceOf[js.Any])
      
      inline def setFullTextUndefined: Self = StObject.set(x, "fullText", js.undefined)
      
      inline def setHeaderMessageId(value: String): Self = StObject.set(x, "headerMessageId", value.asInstanceOf[js.Any])
      
      inline def setHeaderMessageIdUndefined: Self = StObject.set(x, "headerMessageId", js.undefined)
      
      inline def setIncludeSubFolders(value: Boolean): Self = StObject.set(x, "includeSubFolders", value.asInstanceOf[js.Any])
      
      inline def setIncludeSubFoldersUndefined: Self = StObject.set(x, "includeSubFolders", js.undefined)
      
      inline def setRecipients(value: String): Self = StObject.set(x, "recipients", value.asInstanceOf[js.Any])
      
      inline def setRecipientsUndefined: Self = StObject.set(x, "recipients", js.undefined)
      
      inline def setSubject(value: String): Self = StObject.set(x, "subject", value.asInstanceOf[js.Any])
      
      inline def setSubjectUndefined: Self = StObject.set(x, "subject", js.undefined)
      
      inline def setTags(value: TagsDetail): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      inline def setToDate(value: Date): Self = StObject.set(x, "toDate", value.asInstanceOf[js.Any])
      
      inline def setToDateUndefined: Self = StObject.set(x, "toDate", js.undefined)
      
      inline def setToMe(value: Boolean): Self = StObject.set(x, "toMe", value.asInstanceOf[js.Any])
      
      inline def setToMeUndefined: Self = StObject.set(x, "toMe", js.undefined)
      
      inline def setUnread(value: Boolean): Self = StObject.set(x, "unread", value.asInstanceOf[js.Any])
      
      inline def setUnreadUndefined: Self = StObject.set(x, "unread", js.undefined)
    }
  }
  
  trait TagsDetail extends StObject {
    
    /** Whether all of the tag filters must apply, or any of them. */
    var mode: TagsDetailMode
    
    /**
      * A _dictionary object_ with one or more filter condition as _key-value_
      * pairs, the _key_ being the tag to filter on, and the _value_ being a
      * boolean expression, requesting whether a message must include (`true`)
      * or exclude (`false`) the tag. For a list of available tags, call the
      * {@link messages.listTags} method.
      */
    var tags: TagsDetailTags
  }
  object TagsDetail {
    
    inline def apply(mode: TagsDetailMode, tags: TagsDetailTags): TagsDetail = {
      val __obj = js.Dynamic.literal(mode = mode.asInstanceOf[js.Any], tags = tags.asInstanceOf[js.Any])
      __obj.asInstanceOf[TagsDetail]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TagsDetail] (val x: Self) extends AnyVal {
      
      inline def setMode(value: TagsDetailMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setTags(value: TagsDetailTags): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.all
    - typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.any
  */
  trait TagsDetailMode extends StObject
  object TagsDetailMode {
    
    inline def all: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.all = "all".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.all]
    
    inline def any: typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.any = "any".asInstanceOf[typings.thunderbirdWebextBrowser.thunderbirdWebextBrowserStrings.any]
  }
  
  type TagsDetailTags = StringDictionary[Boolean]
  
  trait UpdateTagUpdateProperties extends StObject {
    
    /** Tag color in hex format (i.e.: #000080 for navy blue). */
    var color: js.UndefOr[String] = js.undefined
    
    /** Human-readable tag name. */
    var tag: js.UndefOr[String] = js.undefined
  }
  object UpdateTagUpdateProperties {
    
    inline def apply(): UpdateTagUpdateProperties = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UpdateTagUpdateProperties]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UpdateTagUpdateProperties] (val x: Self) extends AnyVal {
      
      inline def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setTag(value: String): Self = StObject.set(x, "tag", value.asInstanceOf[js.Any])
      
      inline def setTagUndefined: Self = StObject.set(x, "tag", js.undefined)
    }
  }
}
