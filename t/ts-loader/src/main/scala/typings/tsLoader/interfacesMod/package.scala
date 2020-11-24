package typings.tsLoader

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object interfacesMod {
  
  type CustomResolveModuleName = js.Function5[
    /* moduleName */ java.lang.String, 
    /* containingFile */ java.lang.String, 
    /* compilerOptions */ typings.typescript.mod.CompilerOptions, 
    /* moduleResolutionHost */ typings.typescript.mod.ModuleResolutionHost, 
    /* parentResolver */ typings.tsLoader.interfacesMod.ResolveModuleName, 
    typings.typescript.mod.ResolvedModuleWithFailedLookupLocations
  ]
  
  type CustomResolveTypeReferenceDirective = js.Function5[
    /* typeDirectiveName */ java.lang.String, 
    /* containingFile */ java.lang.String, 
    /* compilerOptions */ typings.typescript.mod.CompilerOptions, 
    /* moduleResolutionHost */ typings.typescript.mod.ModuleResolutionHost, 
    /* parentResolver */ typings.tsLoader.anon.FnCall, 
    typings.typescript.mod.ResolvedTypeReferenceDirectiveWithFailedLookupLocations
  ]
  
  type DependencyGraph = org.scalablytyped.runtime.StringDictionary[js.UndefOr[js.Array[typings.tsLoader.interfacesMod.ResolvedModule]]]
  
  type LoaderOptionsCache = org.scalablytyped.runtime.StringDictionary[
    typings.std.WeakMap[
      typings.tsLoader.interfacesMod.LoaderOptions, 
      typings.tsLoader.interfacesMod.LoaderOptions
    ]
  ]
  
  type ResolveModuleName = js.Function4[
    /* moduleName */ java.lang.String, 
    /* containingFile */ java.lang.String, 
    /* compilerOptions */ typings.typescript.mod.CompilerOptions, 
    /* moduleResolutionHost */ typings.typescript.mod.ModuleResolutionHost, 
    typings.typescript.mod.ResolvedModuleWithFailedLookupLocations
  ]
  
  type ResolveSync = js.Function3[
    /* context */ js.UndefOr[java.lang.String], 
    /* path */ java.lang.String, 
    /* moduleName */ java.lang.String, 
    java.lang.String
  ]
  
  type ReverseDependencyGraph = org.scalablytyped.runtime.StringDictionary[js.UndefOr[org.scalablytyped.runtime.StringDictionary[scala.Boolean]]]
  
  type TSFiles = typings.std.Map[java.lang.String, typings.tsLoader.interfacesMod.TSFile]
  
  type TSInstances = org.scalablytyped.runtime.StringDictionary[typings.tsLoader.interfacesMod.TSInstance]
  
  type WatchCallbacks[T] = typings.std.Map[java.lang.String, js.Array[T]]
}
