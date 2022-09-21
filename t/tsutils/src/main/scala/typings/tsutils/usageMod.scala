package typings.tsutils

import typings.std.Map
import typings.typescript.mod.Identifier
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usageMod {
  
  @JSImport("tsutils/util/usage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @js.native
  sealed trait DeclarationDomain extends StObject
  @JSImport("tsutils/util/usage", "DeclarationDomain")
  @js.native
  object DeclarationDomain extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DeclarationDomain & Double] = js.native
    
    @js.native
    sealed trait Any
      extends StObject
         with DeclarationDomain
    /* 7 */ val Any: typings.tsutils.usageMod.DeclarationDomain.Any & Double = js.native
    
    @js.native
    sealed trait Import
      extends StObject
         with DeclarationDomain
    /* 8 */ val Import: typings.tsutils.usageMod.DeclarationDomain.Import & Double = js.native
    
    @js.native
    sealed trait Namespace
      extends StObject
         with DeclarationDomain
    /* 1 */ val Namespace: typings.tsutils.usageMod.DeclarationDomain.Namespace & Double = js.native
    
    @js.native
    sealed trait Type
      extends StObject
         with DeclarationDomain
    /* 2 */ val Type: typings.tsutils.usageMod.DeclarationDomain.Type & Double = js.native
    
    @js.native
    sealed trait Value
      extends StObject
         with DeclarationDomain
    /* 4 */ val Value: typings.tsutils.usageMod.DeclarationDomain.Value & Double = js.native
  }
  
  @js.native
  sealed trait UsageDomain extends StObject
  @JSImport("tsutils/util/usage", "UsageDomain")
  @js.native
  object UsageDomain extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[UsageDomain & Double] = js.native
    
    @js.native
    sealed trait Any
      extends StObject
         with UsageDomain
    /* 7 */ val Any: typings.tsutils.usageMod.UsageDomain.Any & Double = js.native
    
    @js.native
    sealed trait Namespace
      extends StObject
         with UsageDomain
    /* 1 */ val Namespace: typings.tsutils.usageMod.UsageDomain.Namespace & Double = js.native
    
    @js.native
    sealed trait Type
      extends StObject
         with UsageDomain
    /* 2 */ val Type: typings.tsutils.usageMod.UsageDomain.Type & Double = js.native
    
    @js.native
    sealed trait TypeQuery
      extends StObject
         with UsageDomain
    /* 8 */ val TypeQuery: typings.tsutils.usageMod.UsageDomain.TypeQuery & Double = js.native
    
    @js.native
    sealed trait Value
      extends StObject
         with UsageDomain
    /* 4 */ val Value: typings.tsutils.usageMod.UsageDomain.Value & Double = js.native
    
    @js.native
    sealed trait ValueOrNamespace
      extends StObject
         with UsageDomain
    /* 5 */ val ValueOrNamespace: typings.tsutils.usageMod.UsageDomain.ValueOrNamespace & Double = js.native
  }
  
  inline def collectVariableUsage(sourceFile: SourceFile): Map[Identifier, VariableInfo] = ^.asInstanceOf[js.Dynamic].applyDynamic("collectVariableUsage")(sourceFile.asInstanceOf[js.Any]).asInstanceOf[Map[Identifier, VariableInfo]]
  
  inline def getDeclarationDomain(node: Identifier): js.UndefOr[DeclarationDomain] = ^.asInstanceOf[js.Dynamic].applyDynamic("getDeclarationDomain")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[DeclarationDomain]]
  
  inline def getUsageDomain(node: Identifier): js.UndefOr[UsageDomain] = ^.asInstanceOf[js.Dynamic].applyDynamic("getUsageDomain")(node.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[UsageDomain]]
  
  trait VariableInfo extends StObject {
    
    var declarations: js.Array[Identifier]
    
    var domain: DeclarationDomain
    
    var exported: Boolean
    
    var inGlobalScope: Boolean
    
    var uses: js.Array[VariableUse]
  }
  object VariableInfo {
    
    inline def apply(
      declarations: js.Array[Identifier],
      domain: DeclarationDomain,
      exported: Boolean,
      inGlobalScope: Boolean,
      uses: js.Array[VariableUse]
    ): VariableInfo = {
      val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], inGlobalScope = inGlobalScope.asInstanceOf[js.Any], uses = uses.asInstanceOf[js.Any])
      __obj.asInstanceOf[VariableInfo]
    }
    
    extension [Self <: VariableInfo](x: Self) {
      
      inline def setDeclarations(value: js.Array[Identifier]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
      
      inline def setDeclarationsVarargs(value: Identifier*): Self = StObject.set(x, "declarations", js.Array(value*))
      
      inline def setDomain(value: DeclarationDomain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setExported(value: Boolean): Self = StObject.set(x, "exported", value.asInstanceOf[js.Any])
      
      inline def setInGlobalScope(value: Boolean): Self = StObject.set(x, "inGlobalScope", value.asInstanceOf[js.Any])
      
      inline def setUses(value: js.Array[VariableUse]): Self = StObject.set(x, "uses", value.asInstanceOf[js.Any])
      
      inline def setUsesVarargs(value: VariableUse*): Self = StObject.set(x, "uses", js.Array(value*))
    }
  }
  
  trait VariableUse extends StObject {
    
    var domain: UsageDomain
    
    var location: Identifier
  }
  object VariableUse {
    
    inline def apply(domain: UsageDomain, location: Identifier): VariableUse = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[VariableUse]
    }
    
    extension [Self <: VariableUse](x: Self) {
      
      inline def setDomain(value: UsageDomain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setLocation(value: Identifier): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
}
