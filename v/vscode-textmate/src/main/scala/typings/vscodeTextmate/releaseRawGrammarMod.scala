package typings.vscodeTextmate

import org.scalablytyped.runtime.StringDictionary
import typings.vscodeTextmate.releaseRuleMod.RuleId
import typings.vscodeTextmate.releaseThemeMod.ScopeName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object releaseRawGrammarMod {
  
  trait ILocatable extends StObject {
    
    @JSName("$vscodeTextmateLocation")
    val $vscodeTextmateLocation: js.UndefOr[ILocation] = js.undefined
  }
  object ILocatable {
    
    inline def apply(): ILocatable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILocatable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ILocatable] (val x: Self) extends AnyVal {
      
      inline def set$vscodeTextmateLocation(value: ILocation): Self = StObject.set(x, "$vscodeTextmateLocation", value.asInstanceOf[js.Any])
      
      inline def set$vscodeTextmateLocationUndefined: Self = StObject.set(x, "$vscodeTextmateLocation", js.undefined)
    }
  }
  
  trait ILocation extends StObject {
    
    val char: Double
    
    val filename: String
    
    val line: Double
  }
  object ILocation {
    
    inline def apply(char: Double, filename: String, line: Double): ILocation = {
      val __obj = js.Dynamic.literal(char = char.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
      __obj.asInstanceOf[ILocation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ILocation] (val x: Self) extends AnyVal {
      
      inline def setChar(value: Double): Self = StObject.set(x, "char", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRawCaptures
    extends StObject
       with IRawCapturesMap
       with ILocatable
  object IRawCaptures {
    
    inline def apply(): IRawCaptures = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRawCaptures]
    }
  }
  
  type IRawCapturesMap = StringDictionary[IRawRule]
  
  trait IRawGrammar
    extends StObject
       with ILocatable {
    
    val fileTypes: js.UndefOr[js.Array[String]] = js.undefined
    
    val firstLineMatch: js.UndefOr[String] = js.undefined
    
    val injectionSelector: js.UndefOr[String] = js.undefined
    
    val injections: js.UndefOr[StringDictionary[IRawRule]] = js.undefined
    
    val name: js.UndefOr[String] = js.undefined
    
    val patterns: js.Array[IRawRule]
    
    var repository: IRawRepository
    
    val scopeName: ScopeName
  }
  object IRawGrammar {
    
    inline def apply(patterns: js.Array[IRawRule], repository: IRawRepository, scopeName: ScopeName): IRawGrammar = {
      val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], scopeName = scopeName.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRawGrammar]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRawGrammar] (val x: Self) extends AnyVal {
      
      inline def setFileTypes(value: js.Array[String]): Self = StObject.set(x, "fileTypes", value.asInstanceOf[js.Any])
      
      inline def setFileTypesUndefined: Self = StObject.set(x, "fileTypes", js.undefined)
      
      inline def setFileTypesVarargs(value: String*): Self = StObject.set(x, "fileTypes", js.Array(value*))
      
      inline def setFirstLineMatch(value: String): Self = StObject.set(x, "firstLineMatch", value.asInstanceOf[js.Any])
      
      inline def setFirstLineMatchUndefined: Self = StObject.set(x, "firstLineMatch", js.undefined)
      
      inline def setInjectionSelector(value: String): Self = StObject.set(x, "injectionSelector", value.asInstanceOf[js.Any])
      
      inline def setInjectionSelectorUndefined: Self = StObject.set(x, "injectionSelector", js.undefined)
      
      inline def setInjections(value: StringDictionary[IRawRule]): Self = StObject.set(x, "injections", value.asInstanceOf[js.Any])
      
      inline def setInjectionsUndefined: Self = StObject.set(x, "injections", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPatterns(value: js.Array[IRawRule]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      inline def setPatternsVarargs(value: IRawRule*): Self = StObject.set(x, "patterns", js.Array(value*))
      
      inline def setRepository(value: IRawRepository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      inline def setScopeName(value: ScopeName): Self = StObject.set(x, "scopeName", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRawRepository
    extends StObject
       with IRawRepositoryMap
       with ILocatable
  object IRawRepository {
    
    inline def apply($base: IRawRule, $self: IRawRule): IRawRepository = {
      val __obj = js.Dynamic.literal($base = $base.asInstanceOf[js.Any], $self = $self.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRawRepository]
    }
  }
  
  trait IRawRepositoryMap
    extends StObject
       with /* name */ StringDictionary[IRawRule] {
    
    @JSName("$base")
    var $base: IRawRule
    
    @JSName("$self")
    var $self: IRawRule
  }
  object IRawRepositoryMap {
    
    inline def apply($base: IRawRule, $self: IRawRule): IRawRepositoryMap = {
      val __obj = js.Dynamic.literal($base = $base.asInstanceOf[js.Any], $self = $self.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRawRepositoryMap]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRawRepositoryMap] (val x: Self) extends AnyVal {
      
      inline def set$base(value: IRawRule): Self = StObject.set(x, "$base", value.asInstanceOf[js.Any])
      
      inline def set$self(value: IRawRule): Self = StObject.set(x, "$self", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRawRule
    extends StObject
       with ILocatable {
    
    val applyEndPatternLast: js.UndefOr[Boolean] = js.undefined
    
    val begin: js.UndefOr[RegExpString] = js.undefined
    
    val beginCaptures: js.UndefOr[IRawCaptures] = js.undefined
    
    val captures: js.UndefOr[IRawCaptures] = js.undefined
    
    val contentName: js.UndefOr[ScopeName] = js.undefined
    
    val end: js.UndefOr[RegExpString] = js.undefined
    
    val endCaptures: js.UndefOr[IRawCaptures] = js.undefined
    
    var id: js.UndefOr[RuleId] = js.undefined
    
    val include: js.UndefOr[IncludeString] = js.undefined
    
    val `match`: js.UndefOr[RegExpString] = js.undefined
    
    val name: js.UndefOr[ScopeName] = js.undefined
    
    val patterns: js.UndefOr[js.Array[IRawRule]] = js.undefined
    
    val repository: js.UndefOr[IRawRepository] = js.undefined
    
    val `while`: js.UndefOr[RegExpString] = js.undefined
    
    val whileCaptures: js.UndefOr[IRawCaptures] = js.undefined
  }
  object IRawRule {
    
    inline def apply(): IRawRule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRawRule]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRawRule] (val x: Self) extends AnyVal {
      
      inline def setApplyEndPatternLast(value: Boolean): Self = StObject.set(x, "applyEndPatternLast", value.asInstanceOf[js.Any])
      
      inline def setApplyEndPatternLastUndefined: Self = StObject.set(x, "applyEndPatternLast", js.undefined)
      
      inline def setBegin(value: RegExpString): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
      
      inline def setBeginCaptures(value: IRawCaptures): Self = StObject.set(x, "beginCaptures", value.asInstanceOf[js.Any])
      
      inline def setBeginCapturesUndefined: Self = StObject.set(x, "beginCaptures", js.undefined)
      
      inline def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
      
      inline def setCaptures(value: IRawCaptures): Self = StObject.set(x, "captures", value.asInstanceOf[js.Any])
      
      inline def setCapturesUndefined: Self = StObject.set(x, "captures", js.undefined)
      
      inline def setContentName(value: ScopeName): Self = StObject.set(x, "contentName", value.asInstanceOf[js.Any])
      
      inline def setContentNameUndefined: Self = StObject.set(x, "contentName", js.undefined)
      
      inline def setEnd(value: RegExpString): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndCaptures(value: IRawCaptures): Self = StObject.set(x, "endCaptures", value.asInstanceOf[js.Any])
      
      inline def setEndCapturesUndefined: Self = StObject.set(x, "endCaptures", js.undefined)
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setId(value: RuleId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInclude(value: IncludeString): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setMatch(value: RegExpString): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setName(value: ScopeName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPatterns(value: js.Array[IRawRule]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      inline def setPatternsUndefined: Self = StObject.set(x, "patterns", js.undefined)
      
      inline def setPatternsVarargs(value: IRawRule*): Self = StObject.set(x, "patterns", js.Array(value*))
      
      inline def setRepository(value: IRawRepository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
      
      inline def setWhile(value: RegExpString): Self = StObject.set(x, "while", value.asInstanceOf[js.Any])
      
      inline def setWhileCaptures(value: IRawCaptures): Self = StObject.set(x, "whileCaptures", value.asInstanceOf[js.Any])
      
      inline def setWhileCapturesUndefined: Self = StObject.set(x, "whileCaptures", js.undefined)
      
      inline def setWhileUndefined: Self = StObject.set(x, "while", js.undefined)
    }
  }
  
  type IncludeString = String
  
  type RegExpString = String
}
