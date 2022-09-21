package typings.webpack.mod

import typings.std.Set
import typings.webpack.webpackBooleans.`false`
import typings.webpack.webpackBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object optimize {
  
  object InnerGraph {
    
    @JSImport("webpack", "optimize.InnerGraph")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("webpack", "optimize.InnerGraph.addUsage")
    @js.native
    def addUsage: js.Function3[
        /* state */ ParserState, 
        /* symbol */ Null | TopLevelSymbol, 
        /* usage */ String | `true` | TopLevelSymbol, 
        Unit
      ] = js.native
    inline def addUsage_=(
      x: js.Function3[
          /* state */ ParserState, 
          /* symbol */ Null | TopLevelSymbol, 
          /* usage */ String | `true` | TopLevelSymbol, 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addUsage")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "optimize.InnerGraph.addVariableUsage")
    @js.native
    def addVariableUsage: js.Function3[
        /* parser */ JavascriptParser, 
        /* name */ String, 
        /* usage */ String | `true` | TopLevelSymbol, 
        Unit
      ] = js.native
    inline def addVariableUsage_=(
      x: js.Function3[
          /* parser */ JavascriptParser, 
          /* name */ String, 
          /* usage */ String | `true` | TopLevelSymbol, 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("addVariableUsage")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "optimize.InnerGraph.bailout")
    @js.native
    def bailout: js.Function1[/* parserState */ ParserState, Unit] = js.native
    inline def bailout_=(x: js.Function1[/* parserState */ ParserState, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("bailout")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "optimize.InnerGraph.enable")
    @js.native
    def enable: js.Function1[/* parserState */ ParserState, Unit] = js.native
    inline def enable_=(x: js.Function1[/* parserState */ ParserState, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("enable")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "optimize.InnerGraph.getDependencyUsedByExportsCondition")
    @js.native
    def getDependencyUsedByExportsCondition: js.Function3[
        /* dependency */ Dependency, 
        /* usedByExports */ Boolean | Set[String], 
        /* moduleGraph */ ModuleGraph, 
        Null | `false` | (js.Function2[/* arg0 */ ModuleGraphConnection, /* arg1 */ RuntimeSpec, ConnectionState])
      ] = js.native
    inline def getDependencyUsedByExportsCondition_=(
      x: js.Function3[
          /* dependency */ Dependency, 
          /* usedByExports */ Boolean | Set[String], 
          /* moduleGraph */ ModuleGraph, 
          Null | `false` | (js.Function2[/* arg0 */ ModuleGraphConnection, /* arg1 */ RuntimeSpec, ConnectionState])
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getDependencyUsedByExportsCondition")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "optimize.InnerGraph.getTopLevelSymbol")
    @js.native
    def getTopLevelSymbol: js.Function1[/* state */ ParserState, Unit | TopLevelSymbol] = js.native
    inline def getTopLevelSymbol_=(x: js.Function1[/* state */ ParserState, Unit | TopLevelSymbol]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("getTopLevelSymbol")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "optimize.InnerGraph.inferDependencyUsage")
    @js.native
    def inferDependencyUsage: js.Function1[/* state */ ParserState, Unit] = js.native
    inline def inferDependencyUsage_=(x: js.Function1[/* state */ ParserState, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("inferDependencyUsage")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "optimize.InnerGraph.isDependencyUsedByExports")
    @js.native
    def isDependencyUsedByExports: js.Function4[
        /* dependency */ Dependency, 
        /* usedByExports */ Boolean | Set[String], 
        /* moduleGraph */ ModuleGraph, 
        /* runtime */ RuntimeSpec, 
        Boolean
      ] = js.native
    inline def isDependencyUsedByExports_=(
      x: js.Function4[
          /* dependency */ Dependency, 
          /* usedByExports */ Boolean | Set[String], 
          /* moduleGraph */ ModuleGraph, 
          /* runtime */ RuntimeSpec, 
          Boolean
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isDependencyUsedByExports")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "optimize.InnerGraph.isEnabled")
    @js.native
    def isEnabled: js.Function1[/* parserState */ ParserState, Boolean] = js.native
    inline def isEnabled_=(x: js.Function1[/* parserState */ ParserState, Boolean]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("isEnabled")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "optimize.InnerGraph.onUsage")
    @js.native
    def onUsage: js.Function2[
        /* state */ ParserState, 
        /* onUsageCallback */ js.Function1[/* arg0 */ js.UndefOr[Boolean | Set[String]], Unit], 
        Unit
      ] = js.native
    inline def onUsage_=(
      x: js.Function2[
          /* state */ ParserState, 
          /* onUsageCallback */ js.Function1[/* arg0 */ js.UndefOr[Boolean | Set[String]], Unit], 
          Unit
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("onUsage")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "optimize.InnerGraph.setTopLevelSymbol")
    @js.native
    def setTopLevelSymbol: js.Function2[/* state */ ParserState, /* symbol */ TopLevelSymbol, Unit] = js.native
    inline def setTopLevelSymbol_=(x: js.Function2[/* state */ ParserState, /* symbol */ TopLevelSymbol, Unit]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setTopLevelSymbol")(x.asInstanceOf[js.Any])
    
    @JSImport("webpack", "optimize.InnerGraph.tagTopLevelSymbol")
    @js.native
    def tagTopLevelSymbol: js.Function2[/* parser */ JavascriptParser, /* name */ String, TopLevelSymbol] = js.native
    inline def tagTopLevelSymbol_=(x: js.Function2[/* parser */ JavascriptParser, /* name */ String, TopLevelSymbol]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("tagTopLevelSymbol")(x.asInstanceOf[js.Any])
  }
}
