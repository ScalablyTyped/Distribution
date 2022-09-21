package typings.watchpack

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Changes extends StObject {
    
    var changes: Set[String]
    
    var removals: Set[String]
  }
  object Changes {
    
    inline def apply(changes: Set[String], removals: Set[String]): Changes = {
      val __obj = js.Dynamic.literal(changes = changes.asInstanceOf[js.Any], removals = removals.asInstanceOf[js.Any])
      __obj.asInstanceOf[Changes]
    }
    
    extension [Self <: Changes](x: Self) {
      
      inline def setChanges(value: Set[String]): Self = StObject.set(x, "changes", value.asInstanceOf[js.Any])
      
      inline def setRemovals(value: Set[String]): Self = StObject.set(x, "removals", value.asInstanceOf[js.Any])
    }
  }
  
  trait Directories extends StObject {
    
    /**
      * Can only be directories
      * Directory content (and content of children, ...) and existence changes are tracked.
      * For files: content and existence changes are tracked
      * Assumed to exist, when directory is not found without further information a remove event is emitted
      */
    var directories: js.UndefOr[js.Iterable[String]] = js.undefined
    
    /**
      * Can be files or directories
      * For files: content and existence changes are tracked
      * For directories: only existence and timestamp changes are tracked
      */
    var files: js.UndefOr[js.Iterable[String]] = js.undefined
    
    /**
      * Can be files or directories
      * Only existence changes are tracked
      * Assued to not exist, no remove event is emitted when not found initially
      */
    var missing: js.UndefOr[js.Iterable[String]] = js.undefined
    
    var startTime: js.UndefOr[Double] = js.undefined
  }
  object Directories {
    
    inline def apply(): Directories = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Directories]
    }
    
    extension [Self <: Directories](x: Self) {
      
      inline def setDirectories(value: js.Iterable[String]): Self = StObject.set(x, "directories", value.asInstanceOf[js.Any])
      
      inline def setDirectoriesUndefined: Self = StObject.set(x, "directories", js.undefined)
      
      inline def setFiles(value: js.Iterable[String]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
      
      inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
      
      inline def setMissing(value: js.Iterable[String]): Self = StObject.set(x, "missing", value.asInstanceOf[js.Any])
      
      inline def setMissingUndefined: Self = StObject.set(x, "missing", js.undefined)
      
      inline def setStartTime(value: Double): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
      
      inline def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    }
  }
}
