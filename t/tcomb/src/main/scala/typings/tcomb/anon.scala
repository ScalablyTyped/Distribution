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
    
    inline def apply[T](codomain: T, domain: Constructor[String], identity: Boolean, kind: String, name: String): Codomain[T] = {
      val __obj = js.Dynamic.literal(codomain = codomain.asInstanceOf[js.Any], domain = domain.asInstanceOf[js.Any], identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Codomain[T]]
    }
    
    extension [Self <: Codomain[?], T](x: Self & Codomain[T]) {
      
      inline def setCodomain(value: T): Self = StObject.set(x, "codomain", value.asInstanceOf[js.Any])
      
      inline def setDomain(value: Constructor[String]): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
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
    
    inline def apply(
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
    
    extension [Self <: DefaultProps](x: Self) {
      
      inline def setDefaultProps(value: js.Object): Self = StObject.set(x, "defaultProps", value.asInstanceOf[js.Any])
      
      inline def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProps(value: StructProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    }
  }
  
  trait From extends StObject {
    
    var from: Double
    
    var to: Double
  }
  object From {
    
    inline def apply(from: Double, to: Double): From = {
      val __obj = js.Dynamic.literal(from = from.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
      __obj.asInstanceOf[From]
    }
    
    extension [Self <: From](x: Self) {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait Identity extends StObject {
    
    var identity: Boolean
    
    var kind: String
    
    var map: js.Object
    
    var name: String
  }
  object Identity {
    
    inline def apply(identity: Boolean, kind: String, map: js.Object, name: String): Identity = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Identity]
    }
    
    extension [Self <: Identity](x: Self) {
      
      inline def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setMap(value: js.Object): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait IdentityKind[T] extends StObject {
    
    var identity: Boolean
    
    var kind: String
    
    var name: String
    
    def predicate(x: Any): /* is T */ Boolean
    @JSName("predicate")
    var predicate_Original: TypeGuardPredicate[T]
    
    var `type`: Constructor[T]
  }
  object IdentityKind {
    
    inline def apply[T](
      identity: Boolean,
      kind: String,
      name: String,
      predicate: /* x */ Any => /* is T */ Boolean,
      `type`: Constructor[T]
    ): IdentityKind[T] = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], predicate = js.Any.fromFunction1(predicate))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdentityKind[T]]
    }
    
    extension [Self <: IdentityKind[?], T](x: Self & IdentityKind[T]) {
      
      inline def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPredicate(value: /* x */ Any => /* is T */ Boolean): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
      
      inline def setType(value: Constructor[T]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Kind extends StObject {
    
    var identity: Boolean
    
    var kind: String
    
    var name: String
    
    var props: StructProps
    
    var strict: Boolean
  }
  object Kind {
    
    inline def apply(identity: Boolean, kind: String, name: String, props: StructProps, strict: Boolean): Kind = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any])
      __obj.asInstanceOf[Kind]
    }
    
    extension [Self <: Kind](x: Self) {
      
      inline def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProps(value: StructProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
    }
  }
  
  trait KindName extends StObject {
    
    var identity: Boolean
    
    var kind: String
    
    var name: String
  }
  object KindName {
    
    inline def apply(identity: Boolean, kind: String, name: String): KindName = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[KindName]
    }
    
    extension [Self <: KindName](x: Self) {
      
      inline def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name extends StObject {
    
    var identity: Boolean
    
    var kind: String
    
    var name: String
    
    var types: js.Array[Constructor[Any]]
  }
  object Name {
    
    inline def apply(identity: Boolean, kind: String, name: String, types: js.Array[Constructor[Any]]): Name = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: js.Array[Constructor[Any]]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesVarargs(value: Constructor[Any]*): Self = StObject.set(x, "types", js.Array(value*))
    }
  }
  
  trait Predicate[T] extends StObject {
    
    var identity: Boolean
    
    var kind: String
    
    var name: String
    
    def predicate(x: Any): /* is T */ Boolean
    @JSName("predicate")
    var predicate_Original: TypeGuardPredicate[T]
  }
  object Predicate {
    
    inline def apply[T](identity: Boolean, kind: String, name: String, predicate: /* x */ Any => /* is T */ Boolean): Predicate[T] = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], predicate = js.Any.fromFunction1(predicate))
      __obj.asInstanceOf[Predicate[T]]
    }
    
    extension [Self <: Predicate[?], T](x: Self & Predicate[T]) {
      
      inline def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPredicate(value: /* x */ Any => /* is T */ Boolean): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
    }
  }
  
  trait Type[T] extends StObject {
    
    var identity: Boolean
    
    var kind: String
    
    var name: String
    
    var `type`: Constructor[T]
  }
  object Type {
    
    inline def apply[T](identity: Boolean, kind: String, name: String, `type`: Constructor[T]): Type[T] = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Type[T]]
    }
    
    extension [Self <: Type[?], T](x: Self & Type[T]) {
      
      inline def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: Constructor[T]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Types[T] extends StObject {
    
    var identity: Boolean
    
    var kind: String
    
    var name: String
    
    var types: js.Array[Constructor[T]]
  }
  object Types {
    
    inline def apply[T](identity: Boolean, kind: String, name: String, types: js.Array[Constructor[T]]): Types[T] = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[Types[T]]
    }
    
    extension [Self <: Types[?], T](x: Self & Types[T]) {
      
      inline def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: js.Array[Constructor[T]]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesVarargs(value: Constructor[T]*): Self = StObject.set(x, "types", js.Array(value*))
    }
  }
}
