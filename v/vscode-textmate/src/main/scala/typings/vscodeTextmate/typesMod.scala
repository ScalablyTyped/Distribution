package typings.vscodeTextmate

import org.scalablytyped.runtime.StringDictionary
import typings.vscodeTextmate.vscodeTextmateNumbers.`0`
import typings.vscodeTextmate.vscodeTextmateNumbers.`1`
import typings.vscodeTextmate.vscodeTextmateNumbers.`2`
import typings.vscodeTextmate.vscodeTextmateNumbers.`4`
import typings.vscodeTextmate.vscodeTextmateNumbers.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.vscodeTextmate.vscodeTextmateNumbers.`0`
    - typings.vscodeTextmate.vscodeTextmateNumbers.`1`
    - typings.vscodeTextmate.vscodeTextmateNumbers.`2`
    - typings.vscodeTextmate.vscodeTextmateNumbers.`4`
    - typings.vscodeTextmate.vscodeTextmateNumbers.`8`
  */
  trait FindOption extends StObject
  object FindOption {
    
    /**
      * used for debugging purposes.
      */
    inline def DebugCall: `8` = 8.asInstanceOf[`8`]
    
    inline def None: `0` = 0.asInstanceOf[`0`]
    
    /**
      * equivalent of ONIG_OPTION_NOT_BEGIN_POSITION: (start) isn't considered as start position of search (* fail \G)
      */
    inline def NotBeginPosition: `4` = 4.asInstanceOf[`4`]
    
    /**
      * equivalent of ONIG_OPTION_NOT_BEGIN_STRING: (str) isn't considered as begin of string (* fail \A)
      */
    inline def NotBeginString: `1` = 1.asInstanceOf[`1`]
    
    /**
      * equivalent of ONIG_OPTION_NOT_END_STRING: (end) isn't considered as end of string (* fail \z, \Z)
      */
    inline def NotEndString: `2` = 2.asInstanceOf[`2`]
  }
  
  trait ILocatable extends StObject {
    
    @JSName("$vscodeTextmateLocation")
    val $vscodeTextmateLocation: js.UndefOr[ILocation] = js.undefined
  }
  object ILocatable {
    
    inline def apply(): ILocatable = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ILocatable]
    }
    
    extension [Self <: ILocatable](x: Self) {
      
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
    
    extension [Self <: ILocation](x: Self) {
      
      inline def setChar(value: Double): Self = StObject.set(x, "char", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setLine(value: Double): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    }
  }
  
  trait IOnigCaptureIndex extends StObject {
    
    var end: Double
    
    var length: Double
    
    var start: Double
  }
  object IOnigCaptureIndex {
    
    inline def apply(end: Double, length: Double, start: Double): IOnigCaptureIndex = {
      val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], start = start.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOnigCaptureIndex]
    }
    
    extension [Self <: IOnigCaptureIndex](x: Self) {
      
      inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setStart(value: Double): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
    }
  }
  
  trait IOnigLib extends StObject {
    
    def createOnigScanner(sources: js.Array[String]): OnigScanner
    
    def createOnigString(str: String): OnigString
  }
  object IOnigLib {
    
    inline def apply(createOnigScanner: js.Array[String] => OnigScanner, createOnigString: String => OnigString): IOnigLib = {
      val __obj = js.Dynamic.literal(createOnigScanner = js.Any.fromFunction1(createOnigScanner), createOnigString = js.Any.fromFunction1(createOnigString))
      __obj.asInstanceOf[IOnigLib]
    }
    
    extension [Self <: IOnigLib](x: Self) {
      
      inline def setCreateOnigScanner(value: js.Array[String] => OnigScanner): Self = StObject.set(x, "createOnigScanner", js.Any.fromFunction1(value))
      
      inline def setCreateOnigString(value: String => OnigString): Self = StObject.set(x, "createOnigString", js.Any.fromFunction1(value))
    }
  }
  
  trait IOnigMatch extends StObject {
    
    var captureIndices: js.Array[IOnigCaptureIndex]
    
    var index: Double
  }
  object IOnigMatch {
    
    inline def apply(captureIndices: js.Array[IOnigCaptureIndex], index: Double): IOnigMatch = {
      val __obj = js.Dynamic.literal(captureIndices = captureIndices.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any])
      __obj.asInstanceOf[IOnigMatch]
    }
    
    extension [Self <: IOnigMatch](x: Self) {
      
      inline def setCaptureIndices(value: js.Array[IOnigCaptureIndex]): Self = StObject.set(x, "captureIndices", value.asInstanceOf[js.Any])
      
      inline def setCaptureIndicesVarargs(value: IOnigCaptureIndex*): Self = StObject.set(x, "captureIndices", js.Array(value*))
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
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
    
    val scopeName: String
  }
  object IRawGrammar {
    
    inline def apply(patterns: js.Array[IRawRule], repository: IRawRepository, scopeName: String): IRawGrammar = {
      val __obj = js.Dynamic.literal(patterns = patterns.asInstanceOf[js.Any], repository = repository.asInstanceOf[js.Any], scopeName = scopeName.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRawGrammar]
    }
    
    extension [Self <: IRawGrammar](x: Self) {
      
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
      
      inline def setScopeName(value: String): Self = StObject.set(x, "scopeName", value.asInstanceOf[js.Any])
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
    
    extension [Self <: IRawRepositoryMap](x: Self) {
      
      inline def set$base(value: IRawRule): Self = StObject.set(x, "$base", value.asInstanceOf[js.Any])
      
      inline def set$self(value: IRawRule): Self = StObject.set(x, "$self", value.asInstanceOf[js.Any])
    }
  }
  
  trait IRawRule
    extends StObject
       with ILocatable {
    
    val applyEndPatternLast: js.UndefOr[Boolean] = js.undefined
    
    val begin: js.UndefOr[String] = js.undefined
    
    val beginCaptures: js.UndefOr[IRawCaptures] = js.undefined
    
    val captures: js.UndefOr[IRawCaptures] = js.undefined
    
    val contentName: js.UndefOr[String] = js.undefined
    
    val end: js.UndefOr[String] = js.undefined
    
    val endCaptures: js.UndefOr[IRawCaptures] = js.undefined
    
    var id: js.UndefOr[Double] = js.undefined
    
    val include: js.UndefOr[String] = js.undefined
    
    val `match`: js.UndefOr[String] = js.undefined
    
    val name: js.UndefOr[String] = js.undefined
    
    val patterns: js.UndefOr[js.Array[IRawRule]] = js.undefined
    
    val repository: js.UndefOr[IRawRepository] = js.undefined
    
    val `while`: js.UndefOr[String] = js.undefined
    
    val whileCaptures: js.UndefOr[IRawCaptures] = js.undefined
  }
  object IRawRule {
    
    inline def apply(): IRawRule = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRawRule]
    }
    
    extension [Self <: IRawRule](x: Self) {
      
      inline def setApplyEndPatternLast(value: Boolean): Self = StObject.set(x, "applyEndPatternLast", value.asInstanceOf[js.Any])
      
      inline def setApplyEndPatternLastUndefined: Self = StObject.set(x, "applyEndPatternLast", js.undefined)
      
      inline def setBegin(value: String): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
      
      inline def setBeginCaptures(value: IRawCaptures): Self = StObject.set(x, "beginCaptures", value.asInstanceOf[js.Any])
      
      inline def setBeginCapturesUndefined: Self = StObject.set(x, "beginCaptures", js.undefined)
      
      inline def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
      
      inline def setCaptures(value: IRawCaptures): Self = StObject.set(x, "captures", value.asInstanceOf[js.Any])
      
      inline def setCapturesUndefined: Self = StObject.set(x, "captures", js.undefined)
      
      inline def setContentName(value: String): Self = StObject.set(x, "contentName", value.asInstanceOf[js.Any])
      
      inline def setContentNameUndefined: Self = StObject.set(x, "contentName", js.undefined)
      
      inline def setEnd(value: String): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      inline def setEndCaptures(value: IRawCaptures): Self = StObject.set(x, "endCaptures", value.asInstanceOf[js.Any])
      
      inline def setEndCapturesUndefined: Self = StObject.set(x, "endCaptures", js.undefined)
      
      inline def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setInclude(value: String): Self = StObject.set(x, "include", value.asInstanceOf[js.Any])
      
      inline def setIncludeUndefined: Self = StObject.set(x, "include", js.undefined)
      
      inline def setMatch(value: String): Self = StObject.set(x, "match", value.asInstanceOf[js.Any])
      
      inline def setMatchUndefined: Self = StObject.set(x, "match", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setPatterns(value: js.Array[IRawRule]): Self = StObject.set(x, "patterns", value.asInstanceOf[js.Any])
      
      inline def setPatternsUndefined: Self = StObject.set(x, "patterns", js.undefined)
      
      inline def setPatternsVarargs(value: IRawRule*): Self = StObject.set(x, "patterns", js.Array(value*))
      
      inline def setRepository(value: IRawRepository): Self = StObject.set(x, "repository", value.asInstanceOf[js.Any])
      
      inline def setRepositoryUndefined: Self = StObject.set(x, "repository", js.undefined)
      
      inline def setWhile(value: String): Self = StObject.set(x, "while", value.asInstanceOf[js.Any])
      
      inline def setWhileCaptures(value: IRawCaptures): Self = StObject.set(x, "whileCaptures", value.asInstanceOf[js.Any])
      
      inline def setWhileCapturesUndefined: Self = StObject.set(x, "whileCaptures", js.undefined)
      
      inline def setWhileUndefined: Self = StObject.set(x, "while", js.undefined)
    }
  }
  
  @js.native
  trait OnigScanner extends StObject {
    
    var dispose: js.UndefOr[js.Function0[Unit]] = js.native
    
    def findNextMatchSync(string: String, startPosition: Double, options: Double): IOnigMatch | Null = js.native
    def findNextMatchSync(string: OnigString, startPosition: Double, options: Double): IOnigMatch | Null = js.native
  }
  
  trait OnigString extends StObject {
    
    val content: String
    
    var dispose: js.UndefOr[js.Function0[Unit]] = js.undefined
  }
  object OnigString {
    
    inline def apply(content: String): OnigString = {
      val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnigString]
    }
    
    extension [Self <: OnigString](x: Self) {
      
      inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setDispose(value: () => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction0(value))
      
      inline def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
    }
  }
}
