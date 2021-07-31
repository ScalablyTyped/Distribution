package typings.tcomb

import typings.tcomb.mod.Constructor
import typings.tcomb.mod.StructProps
import typings.tcomb.mod.TypeGuardPredicate
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Codomain[T] extends StObject {
    
    var codomain: T
    
    var domain: Constructor[String]
    
    var identity: Boolean
    
    var kind: String
    
    var name: String
  }
  object Codomain {
    
    @scala.inline
    def apply[T](codomain: T, domain: Constructor[String], identity: Boolean, kind: String, name: String): Codomain[T] = {
      val __obj = js.Dynamic.literal(codomain = codomain.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Codomain[T]]
    }
    
    @scala.inline
    implicit class CodomainMutableBuilder[Self <: Codomain[?], T] (val x: Self & Codomain[T]) extends AnyVal {
      
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
  
  trait DefaultProps extends StObject {
    
    var defaultProps: js.Object
    
    var identity: Boolean
    
    var kind: String
    
    var name: String
    
    var props: StructProps
    
    var strict: Boolean
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
  
  trait From extends StObject {
    
    var from: Double
    
    var to: Double
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
  
  trait Identity extends StObject {
    
    var identity: Boolean
    
    var kind: String
    
    var name: String
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
  
  trait IdentityKind[T] extends StObject {
    
    var identity: Boolean
    
    var kind: String
    
    var name: String
    
    var types: js.Array[Constructor[T]]
  }
  object IdentityKind {
    
    @scala.inline
    def apply[T](identity: Boolean, kind: String, name: String, types: js.Array[Constructor[T]]): IdentityKind[T] = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdentityKind[T]]
    }
    
    @scala.inline
    implicit class IdentityKindMutableBuilder[Self <: IdentityKind[?], T] (val x: Self & IdentityKind[T]) extends AnyVal {
      
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
  
  trait Kind[T] extends StObject {
    
    var identity: Boolean
    
    var kind: String
    
    var name: String
    
    def predicate(x: js.Any): /* is T */ Boolean
    @JSName("predicate")
    var predicate_Original: TypeGuardPredicate[T]
  }
  object Kind {
    
    @scala.inline
    def apply[T](identity: Boolean, kind: String, name: String, predicate: /* x */ js.Any => /* is T */ Boolean): Kind[T] = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], predicate = js.Any.fromFunction1(predicate))
      __obj.asInstanceOf[Kind[T]]
    }
    
    @scala.inline
    implicit class KindMutableBuilder[Self <: Kind[?], T] (val x: Self & Kind[T]) extends AnyVal {
      
      @scala.inline
      def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredicate(value: /* x */ js.Any => /* is T */ Boolean): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
    }
  }
  
  trait Map extends StObject {
    
    var identity: Boolean
    
    var kind: String
    
    var map: js.Object
    
    var name: String
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
  
  trait Name[T] extends StObject {
    
    var identity: Boolean
    
    var kind: String
    
    var name: String
    
    def predicate(x: js.Any): /* is T */ Boolean
    @JSName("predicate")
    var predicate_Original: TypeGuardPredicate[T]
    
    var `type`: Constructor[T]
  }
  object Name {
    
    @scala.inline
    def apply[T](
      identity: Boolean,
      kind: String,
      name: String,
      predicate: /* x */ js.Any => /* is T */ Boolean,
      `type`: Constructor[T]
    ): Name[T] = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], predicate = js.Any.fromFunction1(predicate))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name[T]]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name[?], T] (val x: Self & Name[T]) extends AnyVal {
      
      @scala.inline
      def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPredicate(value: /* x */ js.Any => /* is T */ Boolean): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
      
      @scala.inline
      def setType(value: Constructor[T]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Props extends StObject {
    
    var identity: Boolean
    
    var kind: String
    
    var name: String
    
    var props: StructProps
    
    var strict: Boolean
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
  
  trait Type[T] extends StObject {
    
    var identity: Boolean
    
    var kind: String
    
    var name: String
    
    var `type`: Constructor[T]
  }
  object Type {
    
    @scala.inline
    def apply[T](identity: Boolean, kind: String, name: String, `type`: Constructor[T]): Type[T] = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type[T]]
    }
    
    @scala.inline
    implicit class TypeMutableBuilder[Self <: Type[?], T] (val x: Self & Type[T]) extends AnyVal {
      
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
  
  trait Types extends StObject {
    
    var identity: Boolean
    
    var kind: String
    
    var name: String
    
    var types: js.Array[Constructor[js.Any]]
  }
  object Types {
    
    @scala.inline
    def apply(identity: Boolean, kind: String, name: String, types: js.Array[Constructor[js.Any]]): Types = {
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
      def setTypes(value: js.Array[Constructor[js.Any]]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypesVarargs(value: Constructor[js.Any]*): Self = StObject.set(x, "types", js.Array(value :_*))
    }
  }
}
