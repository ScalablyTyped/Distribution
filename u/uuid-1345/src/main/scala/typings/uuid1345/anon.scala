package typings.uuid1345

import typings.uuid1345.mod.UuidTypes
import typings.uuid1345.uuid1345Strings.`object`
import typings.uuid1345.uuid1345Strings.ascii
import typings.uuid1345.uuid1345Strings.binary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait `0` extends StObject {
    
    var encoding: `object` = js.native
    
    var mac: js.UndefOr[Boolean] = js.native
  }
  object `0` {
    
    @scala.inline
    def apply(encoding: `object`): `0` = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[`0`]
    }
    
    @scala.inline
    implicit class `0MutableBuilder`[Self <: `0`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: `object`): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMac(value: Boolean): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
    }
  }
  
  @js.native
  trait `1` extends StObject {
    
    var encoding: ascii = js.native
  }
  object `1` {
    
    @scala.inline
    def apply(encoding: ascii): `1` = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[`1`]
    }
    
    @scala.inline
    implicit class `1MutableBuilder`[Self <: `1`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: ascii): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait `2` extends StObject {
    
    var encoding: binary = js.native
  }
  object `2` {
    
    @scala.inline
    def apply(encoding: binary): `2` = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[`2`]
    }
    
    @scala.inline
    implicit class `2MutableBuilder`[Self <: `2`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: binary): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait `3` extends StObject {
    
    var encoding: `object` = js.native
  }
  object `3` {
    
    @scala.inline
    def apply(encoding: `object`): `3` = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[`3`]
    }
    
    @scala.inline
    implicit class `3MutableBuilder`[Self <: `3`] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: `object`): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Encoding extends StObject {
    
    var encoding: ascii = js.native
    
    var mac: js.UndefOr[Boolean] = js.native
  }
  object Encoding {
    
    @scala.inline
    def apply(encoding: ascii): Encoding = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[Encoding]
    }
    
    @scala.inline
    implicit class EncodingMutableBuilder[Self <: Encoding] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: ascii): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMac(value: Boolean): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
    }
  }
  
  @js.native
  trait EncodingMac extends StObject {
    
    var encoding: binary = js.native
    
    var mac: js.UndefOr[Boolean] = js.native
  }
  object EncodingMac {
    
    @scala.inline
    def apply(encoding: binary): EncodingMac = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncodingMac]
    }
    
    @scala.inline
    implicit class EncodingMacMutableBuilder[Self <: EncodingMac] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: binary): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMac(value: Boolean): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
    }
  }
  
  @js.native
  trait EncodingName extends StObject {
    
    var encoding: binary = js.native
    
    var name: String = js.native
    
    var namespace: UuidTypes = js.native
  }
  object EncodingName {
    
    @scala.inline
    def apply(encoding: binary, name: String, namespace: UuidTypes): EncodingName = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[EncodingName]
    }
    
    @scala.inline
    implicit class EncodingNameMutableBuilder[Self <: EncodingName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: binary): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespace(value: UuidTypes): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Format extends StObject {
    
    var format: String = js.native
    
    var variant: String = js.native
    
    var version: js.UndefOr[Double] = js.native
  }
  object Format {
    
    @scala.inline
    def apply(format: String, variant: String): Format = {
      val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], variant = variant.asInstanceOf[js.Any])
      __obj.asInstanceOf[Format]
    }
    
    @scala.inline
    implicit class FormatMutableBuilder[Self <: Format] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFormat(value: String): Self = StObject.set(x, "format", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariant(value: String): Self = StObject.set(x, "variant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersion(value: Double): Self = StObject.set(x, "version", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVersionUndefined: Self = StObject.set(x, "version", js.undefined)
    }
  }
  
  @js.native
  trait Mac extends StObject {
    
    var mac: js.UndefOr[Boolean] = js.native
  }
  object Mac {
    
    @scala.inline
    def apply(): Mac = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Mac]
    }
    
    @scala.inline
    implicit class MacMutableBuilder[Self <: Mac] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMac(value: Boolean): Self = StObject.set(x, "mac", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMacUndefined: Self = StObject.set(x, "mac", js.undefined)
    }
  }
  
  @js.native
  trait Name extends StObject {
    
    var name: String = js.native
    
    var namespace: UuidTypes = js.native
  }
  object Name {
    
    @scala.inline
    def apply(name: String, namespace: UuidTypes): Name = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[Name]
    }
    
    @scala.inline
    implicit class NameMutableBuilder[Self <: Name] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespace(value: UuidTypes): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait NameNamespace extends StObject {
    
    var encoding: `object` = js.native
    
    var name: String = js.native
    
    var namespace: UuidTypes = js.native
  }
  object NameNamespace {
    
    @scala.inline
    def apply(encoding: `object`, name: String, namespace: UuidTypes): NameNamespace = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[NameNamespace]
    }
    
    @scala.inline
    implicit class NameNamespaceMutableBuilder[Self <: NameNamespace] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: `object`): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespace(value: UuidTypes): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Namespace extends StObject {
    
    var encoding: ascii = js.native
    
    var name: String = js.native
    
    var namespace: UuidTypes = js.native
  }
  object Namespace {
    
    @scala.inline
    def apply(encoding: ascii, name: String, namespace: UuidTypes): Namespace = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], namespace = namespace.asInstanceOf[js.Any])
      __obj.asInstanceOf[Namespace]
    }
    
    @scala.inline
    implicit class NamespaceMutableBuilder[Self <: Namespace] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEncoding(value: ascii): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNamespace(value: UuidTypes): Self = StObject.set(x, "namespace", value.asInstanceOf[js.Any])
    }
  }
}
