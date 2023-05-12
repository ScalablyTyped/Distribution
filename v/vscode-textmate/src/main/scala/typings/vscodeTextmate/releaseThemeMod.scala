package typings.vscodeTextmate

import org.scalablytyped.runtime.StringDictionary
import typings.vscodeTextmate.anon.Background
import typings.vscodeTextmate.releaseUtilsMod.OrMask
import typings.vscodeTextmate.vscodeTextmateInts.`-1`
import typings.vscodeTextmate.vscodeTextmateInts.`0`
import typings.vscodeTextmate.vscodeTextmateInts.`1`
import typings.vscodeTextmate.vscodeTextmateInts.`2`
import typings.vscodeTextmate.vscodeTextmateInts.`4`
import typings.vscodeTextmate.vscodeTextmateInts.`8`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object releaseThemeMod {
  
  @JSImport("vscode-textmate/release/theme", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vscode-textmate/release/theme", "ColorMap")
  @js.native
  open class ColorMap () extends StObject {
    def this(_colorMap: js.Array[String]) = this()
    
    /* private */ var _color2id: Any = js.native
    
    /* private */ var _id2color: Any = js.native
    
    /* private */ val _isFrozen: Any = js.native
    
    /* private */ var _lastColorId: Any = js.native
    
    def getColorMap(): js.Array[String] = js.native
    
    def getId(): Double = js.native
    def getId(color: String): Double = js.native
  }
  
  @JSImport("vscode-textmate/release/theme", "ParsedThemeRule")
  @js.native
  open class ParsedThemeRule protected () extends StObject {
    def this(scope: ScopeName, parentScopes: js.Array[ScopeName], index: Double, fontStyle: OrMask[FontStyle]) = this()
    def this(scope: ScopeName, parentScopes: Null, index: Double, fontStyle: OrMask[FontStyle]) = this()
    def this(
      scope: ScopeName,
      parentScopes: js.Array[ScopeName],
      index: Double,
      fontStyle: OrMask[FontStyle],
      foreground: String
    ) = this()
    def this(
      scope: ScopeName,
      parentScopes: Null,
      index: Double,
      fontStyle: OrMask[FontStyle],
      foreground: String
    ) = this()
    def this(
      scope: ScopeName,
      parentScopes: js.Array[ScopeName],
      index: Double,
      fontStyle: OrMask[FontStyle],
      foreground: String,
      background: String
    ) = this()
    def this(
      scope: ScopeName,
      parentScopes: js.Array[ScopeName],
      index: Double,
      fontStyle: OrMask[FontStyle],
      foreground: Null,
      background: String
    ) = this()
    def this(
      scope: ScopeName,
      parentScopes: Null,
      index: Double,
      fontStyle: OrMask[FontStyle],
      foreground: String,
      background: String
    ) = this()
    def this(
      scope: ScopeName,
      parentScopes: Null,
      index: Double,
      fontStyle: OrMask[FontStyle],
      foreground: Null,
      background: String
    ) = this()
    
    val background: String | Null = js.native
    
    val fontStyle: OrMask[FontStyle] = js.native
    
    val foreground: String | Null = js.native
    
    val index: Double = js.native
    
    val parentScopes: js.Array[ScopeName] | Null = js.native
    
    val scope: ScopeName = js.native
  }
  
  @JSImport("vscode-textmate/release/theme", "ScopeStack")
  @js.native
  open class ScopeStack protected () extends StObject {
    def this(parent: Null, scopeName: ScopeName) = this()
    def this(parent: ScopeStack, scopeName: ScopeName) = this()
    
    def `extends`(other: ScopeStack): Boolean = js.native
    
    def getExtensionIfDefined(): js.UndefOr[js.Array[String]] = js.native
    def getExtensionIfDefined(base: ScopeStack): js.UndefOr[js.Array[String]] = js.native
    
    def getSegments(): js.Array[ScopeName] = js.native
    
    val parent: ScopeStack | Null = js.native
    
    def push(scopeName: ScopeName): ScopeStack = js.native
    
    val scopeName: ScopeName = js.native
  }
  /* static members */
  object ScopeStack {
    
    @JSImport("vscode-textmate/release/theme", "ScopeStack")
    @js.native
    val ^ : js.Any = js.native
    
    inline def from(first: ScopeName, segments: ScopeName*): ScopeStack = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(scala.List(first.asInstanceOf[js.Any]).`++`(segments.asInstanceOf[Seq[js.Any]])*).asInstanceOf[ScopeStack]
    inline def from(segments: ScopeName*): ScopeStack | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("from")(segments.asInstanceOf[Seq[js.Any]]*).asInstanceOf[ScopeStack | Null]
    
    inline def push(path: Null, scopeNames: js.Array[ScopeName]): ScopeStack | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(path.asInstanceOf[js.Any], scopeNames.asInstanceOf[js.Any])).asInstanceOf[ScopeStack | Null]
    inline def push(path: ScopeStack, scopeNames: js.Array[ScopeName]): ScopeStack | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(path.asInstanceOf[js.Any], scopeNames.asInstanceOf[js.Any])).asInstanceOf[ScopeStack | Null]
  }
  
  @JSImport("vscode-textmate/release/theme", "StyleAttributes")
  @js.native
  open class StyleAttributes protected () extends StObject {
    def this(fontStyle: OrMask[FontStyle], foregroundId: Double, backgroundId: Double) = this()
    
    val backgroundId: Double = js.native
    
    val fontStyle: OrMask[FontStyle] = js.native
    
    val foregroundId: Double = js.native
  }
  
  @JSImport("vscode-textmate/release/theme", "Theme")
  @js.native
  open class Theme protected () extends StObject {
    def this(_colorMap: ColorMap, _defaults: StyleAttributes, _root: ThemeTrieElement) = this()
    
    /* private */ val _cachedMatchRoot: Any = js.native
    
    /* private */ val _colorMap: Any = js.native
    
    /* private */ val _defaults: Any = js.native
    
    /* private */ val _root: Any = js.native
    
    def getColorMap(): js.Array[String] = js.native
    
    def getDefaults(): StyleAttributes = js.native
    
    def `match`(): StyleAttributes | Null = js.native
    def `match`(scopePath: ScopeStack): StyleAttributes | Null = js.native
  }
  /* static members */
  object Theme {
    
    @JSImport("vscode-textmate/release/theme", "Theme")
    @js.native
    val ^ : js.Any = js.native
    
    inline def createFromParsedTheme(source: js.Array[ParsedThemeRule]): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromParsedTheme")(source.asInstanceOf[js.Any]).asInstanceOf[Theme]
    inline def createFromParsedTheme(source: js.Array[ParsedThemeRule], colorMap: js.Array[String]): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromParsedTheme")(source.asInstanceOf[js.Any], colorMap.asInstanceOf[js.Any])).asInstanceOf[Theme]
    
    inline def createFromRawTheme(): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromRawTheme")().asInstanceOf[Theme]
    inline def createFromRawTheme(source: Unit, colorMap: js.Array[String]): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromRawTheme")(source.asInstanceOf[js.Any], colorMap.asInstanceOf[js.Any])).asInstanceOf[Theme]
    inline def createFromRawTheme(source: IRawTheme): Theme = ^.asInstanceOf[js.Dynamic].applyDynamic("createFromRawTheme")(source.asInstanceOf[js.Any]).asInstanceOf[Theme]
    inline def createFromRawTheme(source: IRawTheme, colorMap: js.Array[String]): Theme = (^.asInstanceOf[js.Dynamic].applyDynamic("createFromRawTheme")(source.asInstanceOf[js.Any], colorMap.asInstanceOf[js.Any])).asInstanceOf[Theme]
  }
  
  @JSImport("vscode-textmate/release/theme", "ThemeTrieElement")
  @js.native
  open class ThemeTrieElement protected () extends StObject {
    def this(_mainRule: ThemeTrieElementRule) = this()
    def this(_mainRule: ThemeTrieElementRule, rulesWithParentScopes: js.Array[ThemeTrieElementRule]) = this()
    def this(
      _mainRule: ThemeTrieElementRule,
      rulesWithParentScopes: js.Array[ThemeTrieElementRule],
      _children: ITrieChildrenMap
    ) = this()
    def this(_mainRule: ThemeTrieElementRule, rulesWithParentScopes: Unit, _children: ITrieChildrenMap) = this()
    
    /* private */ val _children: Any = js.native
    
    /* private */ var _doInsertHere: Any = js.native
    
    /* private */ val _mainRule: Any = js.native
    
    /* private */ val _rulesWithParentScopes: Any = js.native
    
    def insert(
      scopeDepth: Double,
      scope: ScopeName,
      parentScopes: js.Array[ScopeName],
      fontStyle: Double,
      foreground: Double,
      background: Double
    ): Unit = js.native
    def insert(
      scopeDepth: Double,
      scope: ScopeName,
      parentScopes: Null,
      fontStyle: Double,
      foreground: Double,
      background: Double
    ): Unit = js.native
    
    def `match`(scope: ScopeName): js.Array[ThemeTrieElementRule] = js.native
  }
  /* static members */
  object ThemeTrieElement {
    
    @JSImport("vscode-textmate/release/theme", "ThemeTrieElement")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vscode-textmate/release/theme", "ThemeTrieElement._cmpBySpecificity")
    @js.native
    def _cmpBySpecificity: Any = js.native
    inline def _cmpBySpecificity_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_cmpBySpecificity")(x.asInstanceOf[js.Any])
    
    @JSImport("vscode-textmate/release/theme", "ThemeTrieElement._sortBySpecificity")
    @js.native
    def _sortBySpecificity: Any = js.native
    inline def _sortBySpecificity_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_sortBySpecificity")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("vscode-textmate/release/theme", "ThemeTrieElementRule")
  @js.native
  open class ThemeTrieElementRule protected () extends StObject {
    def this(
      scopeDepth: Double,
      parentScopes: js.Array[ScopeName],
      fontStyle: Double,
      foreground: Double,
      background: Double
    ) = this()
    def this(scopeDepth: Double, parentScopes: Null, fontStyle: Double, foreground: Double, background: Double) = this()
    
    def acceptOverwrite(scopeDepth: Double, fontStyle: Double, foreground: Double, background: Double): Unit = js.native
    
    var background: Double = js.native
    
    var fontStyle: Double = js.native
    
    var foreground: Double = js.native
    
    var parentScopes: js.Array[ScopeName] | Null = js.native
    
    var scopeDepth: Double = js.native
  }
  /* static members */
  object ThemeTrieElementRule {
    
    @JSImport("vscode-textmate/release/theme", "ThemeTrieElementRule")
    @js.native
    val ^ : js.Any = js.native
    
    inline def cloneArr(arr: js.Array[ThemeTrieElementRule]): js.Array[ThemeTrieElementRule] = ^.asInstanceOf[js.Dynamic].applyDynamic("cloneArr")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[ThemeTrieElementRule]]
  }
  
  inline def fontStyleToString(fontStyle: OrMask[FontStyle]): String = ^.asInstanceOf[js.Dynamic].applyDynamic("fontStyleToString")(fontStyle.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def parseTheme(): js.Array[ParsedThemeRule] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTheme")().asInstanceOf[js.Array[ParsedThemeRule]]
  inline def parseTheme(source: IRawTheme): js.Array[ParsedThemeRule] = ^.asInstanceOf[js.Dynamic].applyDynamic("parseTheme")(source.asInstanceOf[js.Any]).asInstanceOf[js.Array[ParsedThemeRule]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.vscodeTextmate.vscodeTextmateInts.`-1`
    - typings.vscodeTextmate.vscodeTextmateInts.`0`
    - typings.vscodeTextmate.vscodeTextmateInts.`1`
    - typings.vscodeTextmate.vscodeTextmateInts.`2`
    - typings.vscodeTextmate.vscodeTextmateInts.`4`
    - typings.vscodeTextmate.vscodeTextmateInts.`8`
  */
  trait FontStyle extends StObject
  object FontStyle {
    
    inline def Bold: `2` = 2.asInstanceOf[`2`]
    
    inline def Italic: `1` = 1.asInstanceOf[`1`]
    
    inline def None: `0` = 0.asInstanceOf[`0`]
    
    inline def NotSet: `-1` = -1.asInstanceOf[`-1`]
    
    inline def Strikethrough: `8` = 8.asInstanceOf[`8`]
    
    inline def Underline: `4` = 4.asInstanceOf[`4`]
  }
  
  trait IRawTheme extends StObject {
    
    val name: js.UndefOr[String] = js.undefined
    
    val settings: js.Array[IRawThemeSetting]
  }
  object IRawTheme {
    
    inline def apply(settings: js.Array[IRawThemeSetting]): IRawTheme = {
      val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRawTheme]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRawTheme] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setSettings(value: js.Array[IRawThemeSetting]): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
      
      inline def setSettingsVarargs(value: IRawThemeSetting*): Self = StObject.set(x, "settings", js.Array(value*))
    }
  }
  
  trait IRawThemeSetting extends StObject {
    
    val name: js.UndefOr[String] = js.undefined
    
    val scope: js.UndefOr[ScopePattern | js.Array[ScopePattern]] = js.undefined
    
    val settings: Background
  }
  object IRawThemeSetting {
    
    inline def apply(settings: Background): IRawThemeSetting = {
      val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRawThemeSetting]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IRawThemeSetting] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setScope(value: ScopePattern | js.Array[ScopePattern]): Self = StObject.set(x, "scope", value.asInstanceOf[js.Any])
      
      inline def setScopeUndefined: Self = StObject.set(x, "scope", js.undefined)
      
      inline def setScopeVarargs(value: ScopePattern*): Self = StObject.set(x, "scope", js.Array(value*))
      
      inline def setSettings(value: Background): Self = StObject.set(x, "settings", value.asInstanceOf[js.Any])
    }
  }
  
  type ITrieChildrenMap = StringDictionary[ThemeTrieElement]
  
  type ScopeName = String
  
  type ScopePath = String
  
  type ScopePattern = String
}
