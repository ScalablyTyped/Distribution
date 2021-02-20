package typings.tcomb

import typings.tcomb.mod.Constructor
import typings.tcomb.mod.StructProps
import typings.tcomb.mod.TypeGuardPredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Codomain[T] extends StObject {
    
    var codomain: T = js.native
    
    var domain: Constructor[String] = js.native
    
    var identity: Boolean = js.native
    
    var kind: String = js.native
    
    var name: String = js.native
  }
  object Codomain {
    
    @scala.inline
    def apply[T](codomain: T, domain: Constructor[String], identity: Boolean, kind: String, name: String): Codomain[T] = {
      val __obj = js.Dynamic.literal(codomain = codomain.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Codomain[T]]
    }
    
    @scala.inline
    implicit class CodomainMutableBuilder[Self <: Codomain[_], T] (val x: Self with Codomain[T]) extends AnyVal {
      
      @scala.inline
      def setCodomain(value: T): Self = StObject.set(x, "codomain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomain(value: Constructor[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait DefaultProps extends StObject {
    
    var defaultProps: js.Object = js.native
    
    var identity: Boolean = js.native
    
    var kind: String = js.native
    
    var name: String = js.native
    
    var props: StructProps = js.native
    
    var strict: Boolean = js.native
  }
  object DefaultProps {
    
    @scala.inline
    def apply(
      defaultProps: js.Object,
      identity: Boolean,
      kind: String,
      name: String,
      props: StructProps,
      strict: Boolean
    ): DefaultProps = {
      val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any])
      __obj.asInstanceOf[DefaultProps]
    }
    
    @scala.inline
    implicit class DefaultPropsMutableBuilder[Self <: DefaultProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultProps(value: js.Object): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: StructProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait From extends StObject {
    
    var from: Double = js.native
    
    var to: Double = js.native
  }
  object From {
    
    @scala.inline
    def apply(from: Double, to: Double): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    @scala.inline
    implicit class FromMutableBuilder[Self <: From] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Identity extends StObject {
    
    var identity: Boolean = js.native
    
    var kind: String = js.native
    
    var name: String = js.native
  }
  object Identity {
    
    @scala.inline
    def apply(identity: Boolean, kind: String, name: String): Identity = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Identity]
    }
    
    @scala.inline
    implicit class IdentityMutableBuilder[Self <: Identity] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IdentityKind[T] extends StObject {
    
    var identity: Boolean = js.native
    
    var kind: String = js.native
    
    var name: String = js.native
    
    var types: js.Array[Constructor[T]] = js.native
  }
  object IdentityKind {
    
    @scala.inline
    def apply[T](identity: Boolean, kind: String, name: String, types: js.Array[Constructor[T]]): IdentityKind[T] = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdentityKind[T]]
    }
    
    @scala.inline
    implicit class IdentityKindMutableBuilder[Self <: IdentityKind[_], T] (val x: Self with IdentityKind[T]) extends AnyVal {
      
      @scala.inline
      def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypes(value: js.Array[Constructor[T]]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesVarargs(value: Constructor[T]*): Self = StObject.set(x, "types", js.Array(value :_*))
    }
  }
  
  @js.native
  trait Kind[T] extends StObject {
    
    var identity: Boolean = js.native
    
    var kind: String = js.native
    
    var name: String = js.native
    
    def predicate(x: js.Any): /* is T */ Boolean = js.native
    @JSName("predicate")
    var predicate_Original: TypeGuardPredicate[T] = js.native
  }
  
  @js.native
  trait Map extends StObject {
    
    var identity: Boolean = js.native
    
    var kind: String = js.native
    
    var map: js.Object = js.native
    
    var name: String = js.native
  }
  object Map {
    
    @scala.inline
    def apply(identity: Boolean, kind: String, map: js.Object, name: String): Map = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Map]
    }
    
    @scala.inline
    implicit class MapMutableBuilder[Self <: Map] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMap(value: js.Object): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Name[T] extends StObject {
    
    var identity: Boolean = js.native
    
    var kind: String = js.native
    
    var name: String = js.native
    
    def predicate(x: js.Any): /* is T */ Boolean = js.native
    @JSName("predicate")
    var predicate_Original: TypeGuardPredicate[T] = js.native
    
    var `type`: Constructor[T] = js.native
  }
  
  @js.native
  trait Props extends StObject {
    
    var identity: Boolean = js.native
    
    var kind: String = js.native
    
    var name: String = js.native
    
    var props: StructProps = js.native
    
    var strict: Boolean = js.native
  }
  object Props {
    
    @scala.inline
    def apply(identity: Boolean, kind: String, name: String, props: StructProps, strict: Boolean): Props = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit class PropsMutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: StructProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Type[T] extends StObject {
    
    var identity: Boolean = js.native
    
    var kind: String = js.native
    
    var name: String = js.native
    
    var `type`: Constructor[T] = js.native
  }
  object Type {
    
    @scala.inline
    def apply[T](identity: Boolean, kind: String, name: String, `type`: Constructor[T]): Type[T] = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type[T]]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type[_], T] (val x: Self with Type[T]) extends AnyVal {
      
      @scala.inline
      def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: Constructor[T]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Types extends StObject {
    
    var identity: Boolean = js.native
    
    var kind: String = js.native
    
    var name: String = js.native
    
    var types: js.Array[Constructor[_]] = js.native
  }
  object Types {
    
    @scala.inline
    def apply(identity: Boolean, kind: String, name: String, types: js.Array[Constructor[_]]): Types = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[Types]
    }
    
    @scala.inline
    implicit class TypesMutableBuilder[Self <: Types] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypes(value: js.Array[Constructor[_]]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesVarargs(value: Constructor[js.Any]*): Self = StObject.set(x, "types", js.Array(value :_*))
    }
  }
}
