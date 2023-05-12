package typings.vscodeTextmate

import typings.vscodeTextmate.releaseTestsResolverMod.Resolver
import typings.vscodeTextmate.releaseTestsThemesDottestMod.ThemeData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object releaseTestsThemeTestMod {
  
  @JSImport("vscode-textmate/release/tests/themeTest", "ThemeTest")
  @js.native
  open class ThemeTest protected () extends StObject {
    def this(THEMES_TEST_PATH: String, testFile: String, themeDatas: js.Array[ThemeData], resolver: Resolver) = this()
    
    /* private */ val EXPECTED_FILE_PATH: Any = js.native
    
    var actual: String | Null = js.native
    
    def evaluate(): js.Promise[Any] = js.native
    
    val expected: String = js.native
    
    val testName: String = js.native
    
    /* private */ val tests: Any = js.native
    
    def writeExpected(): Unit = js.native
  }
  /* static members */
  object ThemeTest {
    
    @JSImport("vscode-textmate/release/tests/themeTest", "ThemeTest")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vscode-textmate/release/tests/themeTest", "ThemeTest._normalizeNewLines")
    @js.native
    def _normalizeNewLines: Any = js.native
    inline def _normalizeNewLines_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_normalizeNewLines")(x.asInstanceOf[js.Any])
    
    @JSImport("vscode-textmate/release/tests/themeTest", "ThemeTest._readFile")
    @js.native
    def _readFile: Any = js.native
    inline def _readFile_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_readFile")(x.asInstanceOf[js.Any])
  }
}
