package typings.uuid1345

import typings.uuid1345.mod.UuidTypes
import typings.uuid1345.uuid1345Strings.`object`
import typings.uuid1345.uuid1345Strings.ascii
import typings.uuid1345.uuid1345Strings.binary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait `0` extends StObject {
    
    var encoding: `object`
    
    var mac: js.UndefOr[Boolean] = js.undefined
  }
  object `0` {
    
    inline def apply(): `0` = {
      val __obj = js.Dynamic.literal(encoding = "object")
      __obj.asInstanceOf[`0`]
    }
    
    extension [Self <: `0`](x: Self) {
      
      inline def setEncoding(value: `object`): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setMac(value: Boolean): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
      
      inline def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
    }
  }
  
  trait `1` extends StObject {
    
    var encoding: ascii
  }
  object `1` {
    
    inline def apply(): `1` = {
      val __obj = js.Dynamic.literal(encoding = "ascii")
      __obj.asInstanceOf[`1`]
    }
    
    extension [Self <: `1`](x: Self) {
      
      inline def setEncoding(value: ascii): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
  
  trait `2` extends StObject {
    
    var encoding: binary
  }
  object `2` {
    
    inline def apply(): `2` = {
      val __obj = js.Dynamic.literal(encoding = "binary")
      __obj.asInstanceOf[`2`]
    }
    
    extension [Self <: `2`](x: Self) {
      
      inline def setEncoding(value: binary): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
  
  trait `3` extends StObject {
    
    var encoding: `object`
  }
  object `3` {
    
    inline def apply(): `3` = {
      val __obj = js.Dynamic.literal(encoding = "object")
      __obj.asInstanceOf[`3`]
    }
    
    extension [Self <: `3`](x: Self) {
      
      inline def setEncoding(value: `object`): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
  
  trait Encoding extends StObject {
    
    var encoding: ascii
    
    var mac: js.UndefOr[Boolean] = js.undefined
  }
  object Encoding {
    
    inline def apply(): Encoding = {
      val __obj = js.Dynamic.literal(encoding = "ascii")
      __obj.asInstanceOf[Encoding]
    }
    
    extension [Self <: Encoding](x: Self) {
      
      inline def setEncoding(value: ascii): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setMac(value: Boolean): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
      
      inline def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
    }
  }
  
  trait EncodingMac extends StObject {
    
    var encoding: binary
    
    var mac: js.UndefOr[Boolean] = js.undefined
  }
  object EncodingMac {
    
    inline def apply(): EncodingMac = {
      val __obj = js.Dynamic.literal(encoding = "binary")
      __obj.asInstanceOf[EncodingMac]
    }
    
    extension [Self <: EncodingMac](x: Self) {
      
      inline def setEncoding(value: binary): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setMac(value: Boolean): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
      
      inline def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
    }
  }
  
  trait EncodingName extends StObject {
    
    var encoding: binary
    
    var name: String
    
    var namespace: UuidTypes
  }
  object EncodingName {
    
    inline def apply(name: String, namespace: UuidTypes): EncodingName = {
      val __obj = js.Dynamic.literal(encoding = "binary", name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncodingName]
    }
    
    extension [Self <: EncodingName](x: Self) {
      
      inline def setEncoding(value: binary): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: UuidTypes): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    }
  }
  
  trait Format extends StObject {
    
    var format: String
    
    var variant: String
    
    var version: js.UndefOr[Double] = js.undefined
  }
  object Format {
    
    inline def apply(format: String, variant: String): Format = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
      __obj.asInstanceOf[Format]
    }
    
    extension [Self <: Format](x: Self) {
      
      inline def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      inline def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      inline def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      inline def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  trait Mac extends StObject {
    
    var mac: js.UndefOr[Boolean] = js.undefined
  }
  object Mac {
    
    inline def apply(): Mac = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Mac]
    }
    
    extension [Self <: Mac](x: Self) {
      
      inline def setMac(value: Boolean): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
      
      inline def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
    }
  }
  
  trait Name extends StObject {
    
    var name: String
    
    var namespace: UuidTypes
  }
  object Name {
    
    inline def apply(name: String, namespace: UuidTypes): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    extension [Self <: Name](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: UuidTypes): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    }
  }
  
  trait NameNamespace extends StObject {
    
    var encoding: `object`
    
    var name: String
    
    var namespace: UuidTypes
  }
  object NameNamespace {
    
    inline def apply(name: String, namespace: UuidTypes): NameNamespace = {
      val __obj = js.Dynamic.literal(encoding = "object", name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameNamespace]
    }
    
    extension [Self <: NameNamespace](x: Self) {
      
      inline def setEncoding(value: `object`): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: UuidTypes): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    }
  }
  
  trait Namespace extends StObject {
    
    var encoding: ascii
    
    var name: String
    
    var namespace: UuidTypes
  }
  object Namespace {
    
    inline def apply(name: String, namespace: UuidTypes): Namespace = {
      val __obj = js.Dynamic.literal(encoding = "ascii", name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[Namespace]
    }
    
    extension [Self <: Namespace](x: Self) {
      
      inline def setEncoding(value: ascii): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNamespace(value: UuidTypes): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    }
  }
}
