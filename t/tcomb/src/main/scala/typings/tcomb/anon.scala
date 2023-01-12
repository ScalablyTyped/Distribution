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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Codomain[?], T] (val x: Self & Codomain[T]) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DefaultProps] (val x: Self) extends AnyVal {
      
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: From] (val x: Self) extends AnyVal {
      
      inline def setFrom(value: Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setTo(value: Double): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
    }
  }
  
  trait Identity extends StObject {
    
    var identity: Boolean
    
    var kind: String
    
    var name: String
  }
  object Identity {
    
    inline def apply(identity: Boolean, kind: String, name: String): Identity = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Identity]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Identity] (val x: Self) extends AnyVal {
      
      inline def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait IdentityKind[T] extends StObject {
    
    var identity: Boolean
    
    var kind: String
    
    var name: String
    
    var types: js.Array[Constructor[T]]
  }
  object IdentityKind {
    
    inline def apply[T](identity: Boolean, kind: String, name: String, types: js.Array[Constructor[T]]): IdentityKind[T] = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[IdentityKind[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IdentityKind[?], T] (val x: Self & IdentityKind[T]) extends AnyVal {
      
      inline def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: js.Array[Constructor[T]]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesVarargs(value: Constructor[T]*): Self = StObject.set(x, "types", js.Array(value*))
    }
  }
  
  trait Kind[T] extends StObject {
    
    var identity: Boolean
    
    var kind: String
    
    var name: String
    
    def predicate(x: Any): /* is T */ Boolean
    @JSName("predicate")
    var predicate_Original: TypeGuardPredicate[T]
  }
  object Kind {
    
    inline def apply[T](identity: Boolean, kind: String, name: String, predicate: /* x */ Any => /* is T */ Boolean): Kind[T] = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], predicate = js.Any.fromFunction1(predicate))
      __obj.asInstanceOf[Kind[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Kind[?], T] (val x: Self & Kind[T]) extends AnyVal {
      
      inline def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPredicate(value: /* x */ Any => /* is T */ Boolean): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
    }
  }
  
  trait Map extends StObject {
    
    var identity: Boolean
    
    var kind: String
    
    var map: js.Object
    
    var name: String
  }
  object Map {
    
    inline def apply(identity: Boolean, kind: String, map: js.Object, name: String): Map = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], map = map.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Map]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Map] (val x: Self) extends AnyVal {
      
      inline def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setMap(value: js.Object): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Name[T] extends StObject {
    
    var identity: Boolean
    
    var kind: String
    
    var name: String
    
    def predicate(x: Any): /* is T */ Boolean
    @JSName("predicate")
    var predicate_Original: TypeGuardPredicate[T]
    
    var `type`: Constructor[T]
  }
  object Name {
    
    inline def apply[T](
      identity: Boolean,
      kind: String,
      name: String,
      predicate: /* x */ Any => /* is T */ Boolean,
      `type`: Constructor[T]
    ): Name[T] = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], predicate = js.Any.fromFunction1(predicate))
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name[T]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Name[?], T] (val x: Self & Name[T]) extends AnyVal {
      
      inline def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPredicate(value: /* x */ Any => /* is T */ Boolean): Self = StObject.set(x, "predicate", js.Any.fromFunction1(value))
      
      inline def setType(value: Constructor[T]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
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
    
    inline def apply(identity: Boolean, kind: String, name: String, props: StructProps, strict: Boolean): Props = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], strict = strict.asInstanceOf[js.Any])
      __obj.asInstanceOf[Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Props] (val x: Self) extends AnyVal {
      
      inline def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setProps(value: StructProps): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
      
      inline def setStrict(value: Boolean): Self = StObject.set(x, "strict", value.asInstanceOf[js.Any])
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
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Type[?], T] (val x: Self & Type[T]) extends AnyVal {
      
      inline def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: Constructor[T]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Types extends StObject {
    
    var identity: Boolean
    
    var kind: String
    
    var name: String
    
    var types: js.Array[Constructor[Any]]
  }
  object Types {
    
    inline def apply(identity: Boolean, kind: String, name: String, types: js.Array[Constructor[Any]]): Types = {
      val __obj = js.Dynamic.literal(identity = identity.asInstanceOf[js.Any], kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], types = types.asInstanceOf[js.Any])
      __obj.asInstanceOf[Types]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Types] (val x: Self) extends AnyVal {
      
      inline def setIdentity(value: Boolean): Self = StObject.set(x, "identity", value.asInstanceOf[js.Any])
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setTypes(value: js.Array[Constructor[Any]]): Self = StObject.set(x, "types", value.asInstanceOf[js.Any])
      
      inline def setTypesVarargs(value: Constructor[Any]*): Self = StObject.set(x, "types", js.Array(value*))
    }
  }
}
