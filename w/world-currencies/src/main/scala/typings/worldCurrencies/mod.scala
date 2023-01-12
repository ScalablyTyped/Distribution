package typings.worldCurrencies

import org.scalablytyped.runtime.Shortcut
import typings.std.Record
import typings.worldCurrencies.anon.Major
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("world-currencies", JSImport.Namespace)
  @js.native
  val ^ : js.Object & (Record[String, Currency]) = js.native
  
  trait CashValues extends StObject {
    
    var frequent: js.Array[String]
    
    var rare: js.Array[String]
  }
  object CashValues {
    
    inline def apply(frequent: js.Array[String], rare: js.Array[String]): CashValues = {
      val __obj = js.Dynamic.literal(frequent = frequent.asInstanceOf[js.Any], rare = rare.asInstanceOf[js.Any])
      __obj.asInstanceOf[CashValues]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CashValues] (val x: Self) extends AnyVal {
      
      inline def setFrequent(value: js.Array[String]): Self = StObject.set(x, "frequent", value.asInstanceOf[js.Any])
      
      inline def setFrequentVarargs(value: String*): Self = StObject.set(x, "frequent", js.Array(value*))
      
      inline def setRare(value: js.Array[String]): Self = StObject.set(x, "rare", value.asInstanceOf[js.Any])
      
      inline def setRareVarargs(value: String*): Self = StObject.set(x, "rare", js.Array(value*))
    }
  }
  
  trait Currency extends StObject {
    
    var banknotes: CashValues
    
    var coins: CashValues
    
    var iso: IsoData
    
    var name: String
    
    var units: Major
  }
  object Currency {
    
    inline def apply(banknotes: CashValues, coins: CashValues, iso: IsoData, name: String, units: Major): Currency = {
      val __obj = js.Dynamic.literal(banknotes = banknotes.asInstanceOf[js.Any], coins = coins.asInstanceOf[js.Any], iso = iso.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], units = units.asInstanceOf[js.Any])
      __obj.asInstanceOf[Currency]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Currency] (val x: Self) extends AnyVal {
      
      inline def setBanknotes(value: CashValues): Self = StObject.set(x, "banknotes", value.asInstanceOf[js.Any])
      
      inline def setCoins(value: CashValues): Self = StObject.set(x, "coins", value.asInstanceOf[js.Any])
      
      inline def setIso(value: IsoData): Self = StObject.set(x, "iso", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setUnits(value: Major): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
    }
  }
  
  trait IsoData extends StObject {
    
    var code: String
    
    var number: String
  }
  object IsoData {
    
    inline def apply(code: String, number: String): IsoData = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsoData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IsoData] (val x: Self) extends AnyVal {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    }
  }
  
  trait MinorUnit
    extends StObject
       with Unit {
    
    var majorValue: Double
  }
  object MinorUnit {
    
    inline def apply(majorValue: Double, name: String, symbol: String): MinorUnit = {
      val __obj = js.Dynamic.literal(majorValue = majorValue.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
      __obj.asInstanceOf[MinorUnit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MinorUnit] (val x: Self) extends AnyVal {
      
      inline def setMajorValue(value: Double): Self = StObject.set(x, "majorValue", value.asInstanceOf[js.Any])
    }
  }
  
  trait Unit extends StObject {
    
    var name: String
    
    var symbol: String
  }
  object Unit {
    
    inline def apply(name: String, symbol: String): Unit = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], symbol = symbol.asInstanceOf[js.Any])
      __obj.asInstanceOf[Unit]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Unit] (val x: Self) extends AnyVal {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSymbol(value: String): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Object & (Record[String, Currency])
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: js.Object & (Record[String, Currency]) = ^
}
