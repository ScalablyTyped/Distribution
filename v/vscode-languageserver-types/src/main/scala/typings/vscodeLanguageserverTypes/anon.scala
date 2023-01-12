package typings.vscodeLanguageserverTypes

import typings.vscodeLanguageserverTypes.mod.DocumentUri
import typings.vscodeLanguageserverTypes.mod.InsertTextFormat
import typings.vscodeLanguageserverTypes.mod.InsertTextMode
import typings.vscodeLanguageserverTypes.mod.LSPAny
import typings.vscodeLanguageserverTypes.mod.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait CommitCharacters extends StObject {
    
    /**
      * A default commit character set.
      *
      * @since 3.17.0
      */
    var commitCharacters: js.UndefOr[js.Array[String]] = js.undefined
    
    /**
      * A default data value.
      *
      * @since 3.17.0
      */
    var data: js.UndefOr[LSPAny] = js.undefined
    
    /**
      * A default edit range.
      *
      * @since 3.17.0
      */
    var editRange: js.UndefOr[Range | Insert] = js.undefined
    
    /**
      * A default insert text format.
      *
      * @since 3.17.0
      */
    var insertTextFormat: js.UndefOr[InsertTextFormat] = js.undefined
    
    /**
      * A default insert text mode.
      *
      * @since 3.17.0
      */
    var insertTextMode: js.UndefOr[InsertTextMode] = js.undefined
  }
  object CommitCharacters {
    
    inline def apply(): CommitCharacters = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommitCharacters]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CommitCharacters] (val x: Self) extends AnyVal {
      
      inline def setCommitCharacters(value: js.Array[String]): Self = StObject.set(x, "commitCharacters", value.asInstanceOf[js.Any])
      
      inline def setCommitCharactersUndefined: Self = StObject.set(x, "commitCharacters", js.undefined)
      
      inline def setCommitCharactersVarargs(value: String*): Self = StObject.set(x, "commitCharacters", js.Array(value*))
      
      inline def setData(value: LSPAny): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataUndefined: Self = StObject.set(x, "data", js.undefined)
      
      inline def setEditRange(value: Range | Insert): Self = StObject.set(x, "editRange", value.asInstanceOf[js.Any])
      
      inline def setEditRangeUndefined: Self = StObject.set(x, "editRange", js.undefined)
      
      inline def setInsertTextFormat(value: InsertTextFormat): Self = StObject.set(x, "insertTextFormat", value.asInstanceOf[js.Any])
      
      inline def setInsertTextFormatUndefined: Self = StObject.set(x, "insertTextFormat", js.undefined)
      
      inline def setInsertTextMode(value: InsertTextMode): Self = StObject.set(x, "insertTextMode", value.asInstanceOf[js.Any])
      
      inline def setInsertTextModeUndefined: Self = StObject.set(x, "insertTextMode", js.undefined)
    }
  }
  
  trait Insert extends StObject {
    
    var insert: Range
    
    var replace: Range
  }
  object Insert {
    
    inline def apply(insert: Range, replace: Range): Insert = {
      val __obj = js.Dynamic.literal(insert = insert.asInstanceOf[js.Any], replace = replace.asInstanceOf[js.Any])
      __obj.asInstanceOf[Insert]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Insert] (val x: Self) extends AnyVal {
      
      inline def setInsert(value: Range): Self = StObject.set(x, "insert", value.asInstanceOf[js.Any])
      
      inline def setReplace(value: Range): Self = StObject.set(x, "replace", value.asInstanceOf[js.Any])
    }
  }
  
  trait Language extends StObject {
    
    var language: String
    
    var value: String
  }
  object Language {
    
    inline def apply(language: String, value: String): Language = {
      val __obj = js.Dynamic.literal(language = language.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[Language]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Language] (val x: Self) extends AnyVal {
      
      inline def setLanguage(value: String): Self = StObject.set(x, "language", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait Reason extends StObject {
    
    /**
      * Human readable description of why the code action is currently disabled.
      *
      * This is displayed in the code actions UI.
      */
    var reason: String
  }
  object Reason {
    
    inline def apply(reason: String): Reason = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[Reason]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Reason] (val x: Self) extends AnyVal {
      
      inline def setReason(value: String): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  trait Uri extends StObject {
    
    var uri: DocumentUri
  }
  object Uri {
    
    inline def apply(uri: DocumentUri): Uri = {
      val __obj = js.Dynamic.literal(uri = uri.asInstanceOf[js.Any])
      __obj.asInstanceOf[Uri]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Uri] (val x: Self) extends AnyVal {
      
      inline def setUri(value: DocumentUri): Self = StObject.set(x, "uri", value.asInstanceOf[js.Any])
    }
  }
}
