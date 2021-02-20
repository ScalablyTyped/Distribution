package typings.tsutils

import typings.std.Map
import typings.typescript.mod.Identifier
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object usageMod {
  
  @js.native
  sealed trait DeclarationDomain extends StObject
  @JSImport("tsutils/util/usage", "DeclarationDomain")
  @js.native
  object DeclarationDomain extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[DeclarationDomain with Double] = js.native
    
    @js.native
    sealed trait Any extends DeclarationDomain
    /* 7 */ val Any: typings.tsutils.usageMod.DeclarationDomain.Any with Double = js.native
    
    @js.native
    sealed trait Import extends DeclarationDomain
    /* 8 */ val Import: typings.tsutils.usageMod.DeclarationDomain.Import with Double = js.native
    
    @js.native
    sealed trait Namespace extends DeclarationDomain
    /* 1 */ val Namespace: typings.tsutils.usageMod.DeclarationDomain.Namespace with Double = js.native
    
    @js.native
    sealed trait Type extends DeclarationDomain
    /* 2 */ val Type: typings.tsutils.usageMod.DeclarationDomain.Type with Double = js.native
    
    @js.native
    sealed trait Value extends DeclarationDomain
    /* 4 */ val Value: typings.tsutils.usageMod.DeclarationDomain.Value with Double = js.native
  }
  
  @js.native
  sealed trait UsageDomain extends StObject
  @JSImport("tsutils/util/usage", "UsageDomain")
  @js.native
  object UsageDomain extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[UsageDomain with Double] = js.native
    
    @js.native
    sealed trait Any extends UsageDomain
    /* 7 */ val Any: typings.tsutils.usageMod.UsageDomain.Any with Double = js.native
    
    @js.native
    sealed trait Namespace extends UsageDomain
    /* 1 */ val Namespace: typings.tsutils.usageMod.UsageDomain.Namespace with Double = js.native
    
    @js.native
    sealed trait Type extends UsageDomain
    /* 2 */ val Type: typings.tsutils.usageMod.UsageDomain.Type with Double = js.native
    
    @js.native
    sealed trait TypeQuery extends UsageDomain
    /* 8 */ val TypeQuery: typings.tsutils.usageMod.UsageDomain.TypeQuery with Double = js.native
    
    @js.native
    sealed trait Value extends UsageDomain
    /* 4 */ val Value: typings.tsutils.usageMod.UsageDomain.Value with Double = js.native
    
    @js.native
    sealed trait ValueOrNamespace extends UsageDomain
    /* 5 */ val ValueOrNamespace: typings.tsutils.usageMod.UsageDomain.ValueOrNamespace with Double = js.native
  }
  
  @JSImport("tsutils/util/usage", "collectVariableUsage")
  @js.native
  def collectVariableUsage(sourceFile: SourceFile): Map[Identifier, VariableInfo] = js.native
  
  @JSImport("tsutils/util/usage", "getDeclarationDomain")
  @js.native
  def getDeclarationDomain(node: Identifier): js.UndefOr[DeclarationDomain] = js.native
  
  @JSImport("tsutils/util/usage", "getUsageDomain")
  @js.native
  def getUsageDomain(node: Identifier): js.UndefOr[UsageDomain] = js.native
  
  @js.native
  trait VariableInfo extends StObject {
    
    var declarations: js.Array[Identifier] = js.native
    
    var domain: DeclarationDomain = js.native
    
    var exported: Boolean = js.native
    
    var inGlobalScope: Boolean = js.native
    
    var uses: js.Array[VariableUse] = js.native
  }
  object VariableInfo {
    
    @scala.inline
    def apply(
      declarations: js.Array[Identifier],
      domain: DeclarationDomain,
      exported: Boolean,
      inGlobalScope: Boolean,
      uses: js.Array[VariableUse]
    ): VariableInfo = {
      val __obj = js.Dynamic.literal(declarations = declarations.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], exported = exported.asInstanceOf[js.Any], inGlobalScope = inGlobalScope.asInstanceOf[js.Any], uses = uses.asInstanceOf[js.Any])
      __obj.asInstanceOf[VariableInfo]
    }
    
    @scala.inline
    implicit class VariableInfoMutableBuilder[Self <: VariableInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDeclarations(value: js.Array[Identifier]): Self = StObject.set(x, "declarations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeclarationsVarargs(value: Identifier*): Self = StObject.set(x, "declarations", js.Array(value :_*))
      
      @scala.inline
      def setDomain(value: DeclarationDomain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExported(value: Boolean): Self = StObject.set(x, "exported", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInGlobalScope(value: Boolean): Self = StObject.set(x, "inGlobalScope", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUses(value: js.Array[VariableUse]): Self = StObject.set(x, "uses", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUsesVarargs(value: VariableUse*): Self = StObject.set(x, "uses", js.Array(value :_*))
    }
  }
  
  @js.native
  trait VariableUse extends StObject {
    
    var domain: UsageDomain = js.native
    
    var location: Identifier = js.native
  }
  object VariableUse {
    
    @scala.inline
    def apply(domain: UsageDomain, location: Identifier): VariableUse = {
      val __obj = js.Dynamic.literal(domain = domain.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any])
      __obj.asInstanceOf[VariableUse]
    }
    
    @scala.inline
    implicit class VariableUseMutableBuilder[Self <: VariableUse] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDomain(value: UsageDomain): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: Identifier): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    }
  }
}
