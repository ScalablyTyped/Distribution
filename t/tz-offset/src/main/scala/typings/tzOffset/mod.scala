package typings.tzOffset

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("tz-offset", "offsetOf")
  @js.native
  def offsetOf(timezone: Timezone): Double = js.native
  
  @JSImport("tz-offset", "removeOffset")
  @js.native
  def removeOffset(date: Date): Double = js.native
  
  @JSImport("tz-offset", "timeAt")
  @js.native
  def timeAt(date: Date, timezone: Timezone): Date = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.tzOffset.tzOffsetStrings.EtcSlashGMTPlussign12
    - typings.tzOffset.tzOffsetStrings.PacificSlashPago_Pago
    - typings.tzOffset.tzOffsetStrings.PacificSlashMidway
    - typings.tzOffset.tzOffsetStrings.PacificSlashHonolulu
    - typings.tzOffset.tzOffsetStrings.AmericaSlashJuneau
    - typings.tzOffset.tzOffsetStrings.AmericaSlashLos_Angeles
    - typings.tzOffset.tzOffsetStrings.AmericaSlashTijuana
    - typings.tzOffset.tzOffsetStrings.AmericaSlashPhoenix
    - typings.tzOffset.tzOffsetStrings.AmericaSlashChihuahua
    - typings.tzOffset.tzOffsetStrings.AmericaSlashMazatlan
    - typings.tzOffset.tzOffsetStrings.AmericaSlashDenver
    - typings.tzOffset.tzOffsetStrings.AmericaSlashGuatemala
    - typings.tzOffset.tzOffsetStrings.AmericaSlashChicago
    - typings.tzOffset.tzOffsetStrings.AmericaSlashMexico_City
    - typings.tzOffset.tzOffsetStrings.AmericaSlashMonterrey
    - typings.tzOffset.tzOffsetStrings.AmericaSlashRegina
    - typings.tzOffset.tzOffsetStrings.AmericaSlashBogota
    - typings.tzOffset.tzOffsetStrings.AmericaSlashNew_York
    - typings.tzOffset.tzOffsetStrings.AmericaSlashIndianaSlashIndianapolis
    - typings.tzOffset.tzOffsetStrings.AmericaSlashLima
    - typings.tzOffset.tzOffsetStrings.AmericaSlashHalifax
    - typings.tzOffset.tzOffsetStrings.AmericaSlashCaracas
    - typings.tzOffset.tzOffsetStrings.AmericaSlashGuyana
    - typings.tzOffset.tzOffsetStrings.AmericaSlashLa_Paz
    - typings.tzOffset.tzOffsetStrings.AmericaSlashPuerto_Rico
    - typings.tzOffset.tzOffsetStrings.AmericaSlashSantiago
    - typings.tzOffset.tzOffsetStrings.AmericaSlashSt_Johns
    - typings.tzOffset.tzOffsetStrings.AmericaSlashSao_Paulo
    - typings.tzOffset.tzOffsetStrings.AmericaSlashArgentinaSlashBuenos_Aires
    - typings.tzOffset.tzOffsetStrings.AmericaSlashGodthab
    - typings.tzOffset.tzOffsetStrings.AmericaSlashMontevideo
    - typings.tzOffset.tzOffsetStrings.AtlanticSlashSouth_Georgia
    - typings.tzOffset.tzOffsetStrings.AtlanticSlashAzores
    - typings.tzOffset.tzOffsetStrings.AtlanticSlashCape_Verde
    - typings.tzOffset.tzOffsetStrings.AfricaSlashCasablanca
    - typings.tzOffset.tzOffsetStrings.EuropeSlashLondon
    - typings.tzOffset.tzOffsetStrings.EuropeSlashLisbon
    - typings.tzOffset.tzOffsetStrings.AfricaSlashMonrovia
    - typings.tzOffset.tzOffsetStrings.EtcSlashUTC
    - typings.tzOffset.tzOffsetStrings.EuropeSlashAmsterdam
    - typings.tzOffset.tzOffsetStrings.EuropeSlashBelgrade
    - typings.tzOffset.tzOffsetStrings.EuropeSlashBerlin
    - typings.tzOffset.tzOffsetStrings.EuropeSlashZurich
    - typings.tzOffset.tzOffsetStrings.EuropeSlashBratislava
    - typings.tzOffset.tzOffsetStrings.EuropeSlashBrussels
    - typings.tzOffset.tzOffsetStrings.EuropeSlashBudapest
    - typings.tzOffset.tzOffsetStrings.EuropeSlashCopenhagen
    - typings.tzOffset.tzOffsetStrings.EuropeSlashDublin
    - typings.tzOffset.tzOffsetStrings.EuropeSlashLjubljana
    - typings.tzOffset.tzOffsetStrings.EuropeSlashMadrid
    - typings.tzOffset.tzOffsetStrings.EuropeSlashParis
    - typings.tzOffset.tzOffsetStrings.EuropeSlashPrague
    - typings.tzOffset.tzOffsetStrings.EuropeSlashRome
    - typings.tzOffset.tzOffsetStrings.EuropeSlashSarajevo
    - typings.tzOffset.tzOffsetStrings.EuropeSlashSkopje
    - typings.tzOffset.tzOffsetStrings.EuropeSlashStockholm
    - typings.tzOffset.tzOffsetStrings.EuropeSlashVienna
    - typings.tzOffset.tzOffsetStrings.EuropeSlashWarsaw
    - typings.tzOffset.tzOffsetStrings.AfricaSlashAlgiers
    - typings.tzOffset.tzOffsetStrings.EuropeSlashZagreb
    - typings.tzOffset.tzOffsetStrings.EuropeSlashAthens
    - typings.tzOffset.tzOffsetStrings.EuropeSlashBucharest
    - typings.tzOffset.tzOffsetStrings.AfricaSlashCairo
    - typings.tzOffset.tzOffsetStrings.AfricaSlashHarare
    - typings.tzOffset.tzOffsetStrings.EuropeSlashHelsinki
    - typings.tzOffset.tzOffsetStrings.AsiaSlashJerusalem
    - typings.tzOffset.tzOffsetStrings.EuropeSlashKaliningrad
    - typings.tzOffset.tzOffsetStrings.EuropeSlashKiev
    - typings.tzOffset.tzOffsetStrings.AfricaSlashJohannesburg
    - typings.tzOffset.tzOffsetStrings.EuropeSlashRiga
    - typings.tzOffset.tzOffsetStrings.EuropeSlashSofia
    - typings.tzOffset.tzOffsetStrings.EuropeSlashTallinn
    - typings.tzOffset.tzOffsetStrings.EuropeSlashVilnius
    - typings.tzOffset.tzOffsetStrings.AsiaSlashBaghdad
    - typings.tzOffset.tzOffsetStrings.EuropeSlashIstanbul
    - typings.tzOffset.tzOffsetStrings.AsiaSlashKuwait
    - typings.tzOffset.tzOffsetStrings.EuropeSlashMinsk
    - typings.tzOffset.tzOffsetStrings.EuropeSlashMoscow
    - typings.tzOffset.tzOffsetStrings.AfricaSlashNairobi
    - typings.tzOffset.tzOffsetStrings.AsiaSlashRiyadh
    - typings.tzOffset.tzOffsetStrings.EuropeSlashVolgograd
    - typings.tzOffset.tzOffsetStrings.AsiaSlashTehran
    - typings.tzOffset.tzOffsetStrings.AsiaSlashMuscat
    - typings.tzOffset.tzOffsetStrings.AsiaSlashBaku
    - typings.tzOffset.tzOffsetStrings.EuropeSlashSamara
    - typings.tzOffset.tzOffsetStrings.AsiaSlashTbilisi
    - typings.tzOffset.tzOffsetStrings.AsiaSlashYerevan
    - typings.tzOffset.tzOffsetStrings.AsiaSlashKabul
    - typings.tzOffset.tzOffsetStrings.AsiaSlashYekaterinburg
    - typings.tzOffset.tzOffsetStrings.AsiaSlashKarachi
    - typings.tzOffset.tzOffsetStrings.AsiaSlashTashkent
    - typings.tzOffset.tzOffsetStrings.AsiaSlashKolkata
    - typings.tzOffset.tzOffsetStrings.AsiaSlashColombo
    - typings.tzOffset.tzOffsetStrings.AsiaSlashKathmandu
    - typings.tzOffset.tzOffsetStrings.AsiaSlashAlmaty
    - typings.tzOffset.tzOffsetStrings.AsiaSlashDhaka
    - typings.tzOffset.tzOffsetStrings.AsiaSlashUrumqi
    - typings.tzOffset.tzOffsetStrings.AsiaSlashRangoon
    - typings.tzOffset.tzOffsetStrings.AsiaSlashBangkok
    - typings.tzOffset.tzOffsetStrings.AsiaSlashJakarta
    - typings.tzOffset.tzOffsetStrings.AsiaSlashKrasnoyarsk
    - typings.tzOffset.tzOffsetStrings.AsiaSlashNovosibirsk
    - typings.tzOffset.tzOffsetStrings.AsiaSlashShanghai
    - typings.tzOffset.tzOffsetStrings.AsiaSlashChongqing
    - typings.tzOffset.tzOffsetStrings.AsiaSlashHong_Kong
    - typings.tzOffset.tzOffsetStrings.AsiaSlashIrkutsk
    - typings.tzOffset.tzOffsetStrings.AsiaSlashKuala_Lumpur
    - typings.tzOffset.tzOffsetStrings.AustraliaSlashPerth
    - typings.tzOffset.tzOffsetStrings.AsiaSlashSingapore
    - typings.tzOffset.tzOffsetStrings.AsiaSlashTaipei
    - typings.tzOffset.tzOffsetStrings.AsiaSlashUlaanbaatar
    - typings.tzOffset.tzOffsetStrings.AsiaSlashTokyo
    - typings.tzOffset.tzOffsetStrings.AsiaSlashSeoul
    - typings.tzOffset.tzOffsetStrings.AsiaSlashYakutsk
    - typings.tzOffset.tzOffsetStrings.AustraliaSlashAdelaide
    - typings.tzOffset.tzOffsetStrings.AustraliaSlashDarwin
    - typings.tzOffset.tzOffsetStrings.AustraliaSlashBrisbane
    - typings.tzOffset.tzOffsetStrings.AustraliaSlashMelbourne
    - typings.tzOffset.tzOffsetStrings.PacificSlashGuam
    - typings.tzOffset.tzOffsetStrings.AustraliaSlashHobart
    - typings.tzOffset.tzOffsetStrings.PacificSlashPort_Moresby
    - typings.tzOffset.tzOffsetStrings.AustraliaSlashSydney
    - typings.tzOffset.tzOffsetStrings.AsiaSlashVladivostok
    - typings.tzOffset.tzOffsetStrings.AsiaSlashMagadan
    - typings.tzOffset.tzOffsetStrings.PacificSlashNoumea
    - typings.tzOffset.tzOffsetStrings.PacificSlashGuadalcanal
    - typings.tzOffset.tzOffsetStrings.AsiaSlashSrednekolymsk
    - typings.tzOffset.tzOffsetStrings.PacificSlashAuckland
    - typings.tzOffset.tzOffsetStrings.PacificSlashFiji
    - typings.tzOffset.tzOffsetStrings.AsiaSlashKamchatka
    - typings.tzOffset.tzOffsetStrings.PacificSlashMajuro
    - typings.tzOffset.tzOffsetStrings.PacificSlashChatham
    - typings.tzOffset.tzOffsetStrings.PacificSlashTongatapu
    - typings.tzOffset.tzOffsetStrings.PacificSlashApia
    - typings.tzOffset.tzOffsetStrings.PacificSlashFakaofo
  */
  trait Timezone extends StObject
  object Timezone {
    
    @scala.inline
    def AfricaSlashAlgiers: typings.tzOffset.tzOffsetStrings.AfricaSlashAlgiers = "Africa/Algiers".asInstanceOf[typings.tzOffset.tzOffsetStrings.AfricaSlashAlgiers]
    
    @scala.inline
    def AfricaSlashCairo: typings.tzOffset.tzOffsetStrings.AfricaSlashCairo = "Africa/Cairo".asInstanceOf[typings.tzOffset.tzOffsetStrings.AfricaSlashCairo]
    
    @scala.inline
    def AfricaSlashCasablanca: typings.tzOffset.tzOffsetStrings.AfricaSlashCasablanca = "Africa/Casablanca".asInstanceOf[typings.tzOffset.tzOffsetStrings.AfricaSlashCasablanca]
    
    @scala.inline
    def AfricaSlashHarare: typings.tzOffset.tzOffsetStrings.AfricaSlashHarare = "Africa/Harare".asInstanceOf[typings.tzOffset.tzOffsetStrings.AfricaSlashHarare]
    
    @scala.inline
    def AfricaSlashJohannesburg: typings.tzOffset.tzOffsetStrings.AfricaSlashJohannesburg = "Africa/Johannesburg".asInstanceOf[typings.tzOffset.tzOffsetStrings.AfricaSlashJohannesburg]
    
    @scala.inline
    def AfricaSlashMonrovia: typings.tzOffset.tzOffsetStrings.AfricaSlashMonrovia = "Africa/Monrovia".asInstanceOf[typings.tzOffset.tzOffsetStrings.AfricaSlashMonrovia]
    
    @scala.inline
    def AfricaSlashNairobi: typings.tzOffset.tzOffsetStrings.AfricaSlashNairobi = "Africa/Nairobi".asInstanceOf[typings.tzOffset.tzOffsetStrings.AfricaSlashNairobi]
    
    @scala.inline
    def AmericaSlashArgentinaSlashBuenos_Aires: typings.tzOffset.tzOffsetStrings.AmericaSlashArgentinaSlashBuenos_Aires = "America/Argentina/Buenos_Aires".asInstanceOf[typings.tzOffset.tzOffsetStrings.AmericaSlashArgentinaSlashBuenos_Aires]
    
    @scala.inline
    def AmericaSlashBogota: typings.tzOffset.tzOffsetStrings.AmericaSlashBogota = "America/Bogota".asInstanceOf[typings.tzOffset.tzOffsetStrings.AmericaSlashBogota]
    
    @scala.inline
    def AmericaSlashCaracas: typings.tzOffset.tzOffsetStrings.AmericaSlashCaracas = "America/Caracas".asInstanceOf[typings.tzOffset.tzOffsetStrings.AmericaSlashCaracas]
    
    @scala.inline
    def AmericaSlashChicago: typings.tzOffset.tzOffsetStrings.AmericaSlashChicago = "America/Chicago".asInstanceOf[typings.tzOffset.tzOffsetStrings.AmericaSlashChicago]
    
    @scala.inline
    def AmericaSlashChihuahua: typings.tzOffset.tzOffsetStrings.AmericaSlashChihuahua = "America/Chihuahua".asInstanceOf[typings.tzOffset.tzOffsetStrings.AmericaSlashChihuahua]
    
    @scala.inline
    def AmericaSlashDenver: typings.tzOffset.tzOffsetStrings.AmericaSlashDenver = "America/Denver".asInstanceOf[typings.tzOffset.tzOffsetStrings.AmericaSlashDenver]
    
    @scala.inline
    def AmericaSlashGodthab: typings.tzOffset.tzOffsetStrings.AmericaSlashGodthab = "America/Godthab".asInstanceOf[typings.tzOffset.tzOffsetStrings.AmericaSlashGodthab]
    
    @scala.inline
    def AmericaSlashGuatemala: typings.tzOffset.tzOffsetStrings.AmericaSlashGuatemala = "America/Guatemala".asInstanceOf[typings.tzOffset.tzOffsetStrings.AmericaSlashGuatemala]
    
    @scala.inline
    def AmericaSlashGuyana: typings.tzOffset.tzOffsetStrings.AmericaSlashGuyana = "America/Guyana".asInstanceOf[typings.tzOffset.tzOffsetStrings.AmericaSlashGuyana]
    
    @scala.inline
    def AmericaSlashHalifax: typings.tzOffset.tzOffsetStrings.AmericaSlashHalifax = "America/Halifax".asInstanceOf[typings.tzOffset.tzOffsetStrings.AmericaSlashHalifax]
    
    @scala.inline
    def AmericaSlashIndianaSlashIndianapolis: typings.tzOffset.tzOffsetStrings.AmericaSlashIndianaSlashIndianapolis = "America/Indiana/Indianapolis".asInstanceOf[typings.tzOffset.tzOffsetStrings.AmericaSlashIndianaSlashIndianapolis]
    
    @scala.inline
    def AmericaSlashJuneau: typings.tzOffset.tzOffsetStrings.AmericaSlashJuneau = "America/Juneau".asInstanceOf[typings.tzOffset.tzOffsetStrings.AmericaSlashJuneau]
    
    @scala.inline
    def AmericaSlashLa_Paz: typings.tzOffset.tzOffsetStrings.AmericaSlashLa_Paz = "America/La_Paz".asInstanceOf[typings.tzOffset.tzOffsetStrings.AmericaSlashLa_Paz]
    
    @scala.inline
    def AmericaSlashLima: typings.tzOffset.tzOffsetStrings.AmericaSlashLima = "America/Lima".asInstanceOf[typings.tzOffset.tzOffsetStrings.AmericaSlashLima]
    
    @scala.inline
    def AmericaSlashLos_Angeles: typings.tzOffset.tzOffsetStrings.AmericaSlashLos_Angeles = "America/Los_Angeles".asInstanceOf[typings.tzOffset.tzOffsetStrings.AmericaSlashLos_Angeles]
    
    @scala.inline
    def AmericaSlashMazatlan: typings.tzOffset.tzOffsetStrings.AmericaSlashMazatlan = "America/Mazatlan".asInstanceOf[typings.tzOffset.tzOffsetStrings.AmericaSlashMazatlan]
    
    @scala.inline
    def AmericaSlashMexico_City: typings.tzOffset.tzOffsetStrings.AmericaSlashMexico_City = "America/Mexico_City".asInstanceOf[typings.tzOffset.tzOffsetStrings.AmericaSlashMexico_City]
    
    @scala.inline
    def AmericaSlashMonterrey: typings.tzOffset.tzOffsetStrings.AmericaSlashMonterrey = "America/Monterrey".asInstanceOf[typings.tzOffset.tzOffsetStrings.AmericaSlashMonterrey]
    
    @scala.inline
    def AmericaSlashMontevideo: typings.tzOffset.tzOffsetStrings.AmericaSlashMontevideo = "America/Montevideo".asInstanceOf[typings.tzOffset.tzOffsetStrings.AmericaSlashMontevideo]
    
    @scala.inline
    def AmericaSlashNew_York: typings.tzOffset.tzOffsetStrings.AmericaSlashNew_York = "America/New_York".asInstanceOf[typings.tzOffset.tzOffsetStrings.AmericaSlashNew_York]
    
    @scala.inline
    def AmericaSlashPhoenix: typings.tzOffset.tzOffsetStrings.AmericaSlashPhoenix = "America/Phoenix".asInstanceOf[typings.tzOffset.tzOffsetStrings.AmericaSlashPhoenix]
    
    @scala.inline
    def AmericaSlashPuerto_Rico: typings.tzOffset.tzOffsetStrings.AmericaSlashPuerto_Rico = "America/Puerto_Rico".asInstanceOf[typings.tzOffset.tzOffsetStrings.AmericaSlashPuerto_Rico]
    
    @scala.inline
    def AmericaSlashRegina: typings.tzOffset.tzOffsetStrings.AmericaSlashRegina = "America/Regina".asInstanceOf[typings.tzOffset.tzOffsetStrings.AmericaSlashRegina]
    
    @scala.inline
    def AmericaSlashSantiago: typings.tzOffset.tzOffsetStrings.AmericaSlashSantiago = "America/Santiago".asInstanceOf[typings.tzOffset.tzOffsetStrings.AmericaSlashSantiago]
    
    @scala.inline
    def AmericaSlashSao_Paulo: typings.tzOffset.tzOffsetStrings.AmericaSlashSao_Paulo = "America/Sao_Paulo".asInstanceOf[typings.tzOffset.tzOffsetStrings.AmericaSlashSao_Paulo]
    
    @scala.inline
    def AmericaSlashSt_Johns: typings.tzOffset.tzOffsetStrings.AmericaSlashSt_Johns = "America/St_Johns".asInstanceOf[typings.tzOffset.tzOffsetStrings.AmericaSlashSt_Johns]
    
    @scala.inline
    def AmericaSlashTijuana: typings.tzOffset.tzOffsetStrings.AmericaSlashTijuana = "America/Tijuana".asInstanceOf[typings.tzOffset.tzOffsetStrings.AmericaSlashTijuana]
    
    @scala.inline
    def AsiaSlashAlmaty: typings.tzOffset.tzOffsetStrings.AsiaSlashAlmaty = "Asia/Almaty".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashAlmaty]
    
    @scala.inline
    def AsiaSlashBaghdad: typings.tzOffset.tzOffsetStrings.AsiaSlashBaghdad = "Asia/Baghdad".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashBaghdad]
    
    @scala.inline
    def AsiaSlashBaku: typings.tzOffset.tzOffsetStrings.AsiaSlashBaku = "Asia/Baku".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashBaku]
    
    @scala.inline
    def AsiaSlashBangkok: typings.tzOffset.tzOffsetStrings.AsiaSlashBangkok = "Asia/Bangkok".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashBangkok]
    
    @scala.inline
    def AsiaSlashChongqing: typings.tzOffset.tzOffsetStrings.AsiaSlashChongqing = "Asia/Chongqing".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashChongqing]
    
    @scala.inline
    def AsiaSlashColombo: typings.tzOffset.tzOffsetStrings.AsiaSlashColombo = "Asia/Colombo".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashColombo]
    
    @scala.inline
    def AsiaSlashDhaka: typings.tzOffset.tzOffsetStrings.AsiaSlashDhaka = "Asia/Dhaka".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashDhaka]
    
    @scala.inline
    def AsiaSlashHong_Kong: typings.tzOffset.tzOffsetStrings.AsiaSlashHong_Kong = "Asia/Hong_Kong".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashHong_Kong]
    
    @scala.inline
    def AsiaSlashIrkutsk: typings.tzOffset.tzOffsetStrings.AsiaSlashIrkutsk = "Asia/Irkutsk".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashIrkutsk]
    
    @scala.inline
    def AsiaSlashJakarta: typings.tzOffset.tzOffsetStrings.AsiaSlashJakarta = "Asia/Jakarta".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashJakarta]
    
    @scala.inline
    def AsiaSlashJerusalem: typings.tzOffset.tzOffsetStrings.AsiaSlashJerusalem = "Asia/Jerusalem".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashJerusalem]
    
    @scala.inline
    def AsiaSlashKabul: typings.tzOffset.tzOffsetStrings.AsiaSlashKabul = "Asia/Kabul".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashKabul]
    
    @scala.inline
    def AsiaSlashKamchatka: typings.tzOffset.tzOffsetStrings.AsiaSlashKamchatka = "Asia/Kamchatka".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashKamchatka]
    
    @scala.inline
    def AsiaSlashKarachi: typings.tzOffset.tzOffsetStrings.AsiaSlashKarachi = "Asia/Karachi".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashKarachi]
    
    @scala.inline
    def AsiaSlashKathmandu: typings.tzOffset.tzOffsetStrings.AsiaSlashKathmandu = "Asia/Kathmandu".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashKathmandu]
    
    @scala.inline
    def AsiaSlashKolkata: typings.tzOffset.tzOffsetStrings.AsiaSlashKolkata = "Asia/Kolkata".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashKolkata]
    
    @scala.inline
    def AsiaSlashKrasnoyarsk: typings.tzOffset.tzOffsetStrings.AsiaSlashKrasnoyarsk = "Asia/Krasnoyarsk".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashKrasnoyarsk]
    
    @scala.inline
    def AsiaSlashKuala_Lumpur: typings.tzOffset.tzOffsetStrings.AsiaSlashKuala_Lumpur = "Asia/Kuala_Lumpur".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashKuala_Lumpur]
    
    @scala.inline
    def AsiaSlashKuwait: typings.tzOffset.tzOffsetStrings.AsiaSlashKuwait = "Asia/Kuwait".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashKuwait]
    
    @scala.inline
    def AsiaSlashMagadan: typings.tzOffset.tzOffsetStrings.AsiaSlashMagadan = "Asia/Magadan".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashMagadan]
    
    @scala.inline
    def AsiaSlashMuscat: typings.tzOffset.tzOffsetStrings.AsiaSlashMuscat = "Asia/Muscat".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashMuscat]
    
    @scala.inline
    def AsiaSlashNovosibirsk: typings.tzOffset.tzOffsetStrings.AsiaSlashNovosibirsk = "Asia/Novosibirsk".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashNovosibirsk]
    
    @scala.inline
    def AsiaSlashRangoon: typings.tzOffset.tzOffsetStrings.AsiaSlashRangoon = "Asia/Rangoon".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashRangoon]
    
    @scala.inline
    def AsiaSlashRiyadh: typings.tzOffset.tzOffsetStrings.AsiaSlashRiyadh = "Asia/Riyadh".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashRiyadh]
    
    @scala.inline
    def AsiaSlashSeoul: typings.tzOffset.tzOffsetStrings.AsiaSlashSeoul = "Asia/Seoul".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashSeoul]
    
    @scala.inline
    def AsiaSlashShanghai: typings.tzOffset.tzOffsetStrings.AsiaSlashShanghai = "Asia/Shanghai".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashShanghai]
    
    @scala.inline
    def AsiaSlashSingapore: typings.tzOffset.tzOffsetStrings.AsiaSlashSingapore = "Asia/Singapore".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashSingapore]
    
    @scala.inline
    def AsiaSlashSrednekolymsk: typings.tzOffset.tzOffsetStrings.AsiaSlashSrednekolymsk = "Asia/Srednekolymsk".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashSrednekolymsk]
    
    @scala.inline
    def AsiaSlashTaipei: typings.tzOffset.tzOffsetStrings.AsiaSlashTaipei = "Asia/Taipei".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashTaipei]
    
    @scala.inline
    def AsiaSlashTashkent: typings.tzOffset.tzOffsetStrings.AsiaSlashTashkent = "Asia/Tashkent".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashTashkent]
    
    @scala.inline
    def AsiaSlashTbilisi: typings.tzOffset.tzOffsetStrings.AsiaSlashTbilisi = "Asia/Tbilisi".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashTbilisi]
    
    @scala.inline
    def AsiaSlashTehran: typings.tzOffset.tzOffsetStrings.AsiaSlashTehran = "Asia/Tehran".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashTehran]
    
    @scala.inline
    def AsiaSlashTokyo: typings.tzOffset.tzOffsetStrings.AsiaSlashTokyo = "Asia/Tokyo".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashTokyo]
    
    @scala.inline
    def AsiaSlashUlaanbaatar: typings.tzOffset.tzOffsetStrings.AsiaSlashUlaanbaatar = "Asia/Ulaanbaatar".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashUlaanbaatar]
    
    @scala.inline
    def AsiaSlashUrumqi: typings.tzOffset.tzOffsetStrings.AsiaSlashUrumqi = "Asia/Urumqi".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashUrumqi]
    
    @scala.inline
    def AsiaSlashVladivostok: typings.tzOffset.tzOffsetStrings.AsiaSlashVladivostok = "Asia/Vladivostok".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashVladivostok]
    
    @scala.inline
    def AsiaSlashYakutsk: typings.tzOffset.tzOffsetStrings.AsiaSlashYakutsk = "Asia/Yakutsk".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashYakutsk]
    
    @scala.inline
    def AsiaSlashYekaterinburg: typings.tzOffset.tzOffsetStrings.AsiaSlashYekaterinburg = "Asia/Yekaterinburg".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashYekaterinburg]
    
    @scala.inline
    def AsiaSlashYerevan: typings.tzOffset.tzOffsetStrings.AsiaSlashYerevan = "Asia/Yerevan".asInstanceOf[typings.tzOffset.tzOffsetStrings.AsiaSlashYerevan]
    
    @scala.inline
    def AtlanticSlashAzores: typings.tzOffset.tzOffsetStrings.AtlanticSlashAzores = "Atlantic/Azores".asInstanceOf[typings.tzOffset.tzOffsetStrings.AtlanticSlashAzores]
    
    @scala.inline
    def AtlanticSlashCape_Verde: typings.tzOffset.tzOffsetStrings.AtlanticSlashCape_Verde = "Atlantic/Cape_Verde".asInstanceOf[typings.tzOffset.tzOffsetStrings.AtlanticSlashCape_Verde]
    
    @scala.inline
    def AtlanticSlashSouth_Georgia: typings.tzOffset.tzOffsetStrings.AtlanticSlashSouth_Georgia = "Atlantic/South_Georgia".asInstanceOf[typings.tzOffset.tzOffsetStrings.AtlanticSlashSouth_Georgia]
    
    @scala.inline
    def AustraliaSlashAdelaide: typings.tzOffset.tzOffsetStrings.AustraliaSlashAdelaide = "Australia/Adelaide".asInstanceOf[typings.tzOffset.tzOffsetStrings.AustraliaSlashAdelaide]
    
    @scala.inline
    def AustraliaSlashBrisbane: typings.tzOffset.tzOffsetStrings.AustraliaSlashBrisbane = "Australia/Brisbane".asInstanceOf[typings.tzOffset.tzOffsetStrings.AustraliaSlashBrisbane]
    
    @scala.inline
    def AustraliaSlashDarwin: typings.tzOffset.tzOffsetStrings.AustraliaSlashDarwin = "Australia/Darwin".asInstanceOf[typings.tzOffset.tzOffsetStrings.AustraliaSlashDarwin]
    
    @scala.inline
    def AustraliaSlashHobart: typings.tzOffset.tzOffsetStrings.AustraliaSlashHobart = "Australia/Hobart".asInstanceOf[typings.tzOffset.tzOffsetStrings.AustraliaSlashHobart]
    
    @scala.inline
    def AustraliaSlashMelbourne: typings.tzOffset.tzOffsetStrings.AustraliaSlashMelbourne = "Australia/Melbourne".asInstanceOf[typings.tzOffset.tzOffsetStrings.AustraliaSlashMelbourne]
    
    @scala.inline
    def AustraliaSlashPerth: typings.tzOffset.tzOffsetStrings.AustraliaSlashPerth = "Australia/Perth".asInstanceOf[typings.tzOffset.tzOffsetStrings.AustraliaSlashPerth]
    
    @scala.inline
    def AustraliaSlashSydney: typings.tzOffset.tzOffsetStrings.AustraliaSlashSydney = "Australia/Sydney".asInstanceOf[typings.tzOffset.tzOffsetStrings.AustraliaSlashSydney]
    
    @scala.inline
    def EtcSlashGMTPlussign12: typings.tzOffset.tzOffsetStrings.EtcSlashGMTPlussign12 = "Etc/GMT+12".asInstanceOf[typings.tzOffset.tzOffsetStrings.EtcSlashGMTPlussign12]
    
    @scala.inline
    def EtcSlashUTC: typings.tzOffset.tzOffsetStrings.EtcSlashUTC = "Etc/UTC".asInstanceOf[typings.tzOffset.tzOffsetStrings.EtcSlashUTC]
    
    @scala.inline
    def EuropeSlashAmsterdam: typings.tzOffset.tzOffsetStrings.EuropeSlashAmsterdam = "Europe/Amsterdam".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashAmsterdam]
    
    @scala.inline
    def EuropeSlashAthens: typings.tzOffset.tzOffsetStrings.EuropeSlashAthens = "Europe/Athens".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashAthens]
    
    @scala.inline
    def EuropeSlashBelgrade: typings.tzOffset.tzOffsetStrings.EuropeSlashBelgrade = "Europe/Belgrade".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashBelgrade]
    
    @scala.inline
    def EuropeSlashBerlin: typings.tzOffset.tzOffsetStrings.EuropeSlashBerlin = "Europe/Berlin".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashBerlin]
    
    @scala.inline
    def EuropeSlashBratislava: typings.tzOffset.tzOffsetStrings.EuropeSlashBratislava = "Europe/Bratislava".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashBratislava]
    
    @scala.inline
    def EuropeSlashBrussels: typings.tzOffset.tzOffsetStrings.EuropeSlashBrussels = "Europe/Brussels".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashBrussels]
    
    @scala.inline
    def EuropeSlashBucharest: typings.tzOffset.tzOffsetStrings.EuropeSlashBucharest = "Europe/Bucharest".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashBucharest]
    
    @scala.inline
    def EuropeSlashBudapest: typings.tzOffset.tzOffsetStrings.EuropeSlashBudapest = "Europe/Budapest".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashBudapest]
    
    @scala.inline
    def EuropeSlashCopenhagen: typings.tzOffset.tzOffsetStrings.EuropeSlashCopenhagen = "Europe/Copenhagen".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashCopenhagen]
    
    @scala.inline
    def EuropeSlashDublin: typings.tzOffset.tzOffsetStrings.EuropeSlashDublin = "Europe/Dublin".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashDublin]
    
    @scala.inline
    def EuropeSlashHelsinki: typings.tzOffset.tzOffsetStrings.EuropeSlashHelsinki = "Europe/Helsinki".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashHelsinki]
    
    @scala.inline
    def EuropeSlashIstanbul: typings.tzOffset.tzOffsetStrings.EuropeSlashIstanbul = "Europe/Istanbul".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashIstanbul]
    
    @scala.inline
    def EuropeSlashKaliningrad: typings.tzOffset.tzOffsetStrings.EuropeSlashKaliningrad = "Europe/Kaliningrad".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashKaliningrad]
    
    @scala.inline
    def EuropeSlashKiev: typings.tzOffset.tzOffsetStrings.EuropeSlashKiev = "Europe/Kiev".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashKiev]
    
    @scala.inline
    def EuropeSlashLisbon: typings.tzOffset.tzOffsetStrings.EuropeSlashLisbon = "Europe/Lisbon".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashLisbon]
    
    @scala.inline
    def EuropeSlashLjubljana: typings.tzOffset.tzOffsetStrings.EuropeSlashLjubljana = "Europe/Ljubljana".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashLjubljana]
    
    @scala.inline
    def EuropeSlashLondon: typings.tzOffset.tzOffsetStrings.EuropeSlashLondon = "Europe/London".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashLondon]
    
    @scala.inline
    def EuropeSlashMadrid: typings.tzOffset.tzOffsetStrings.EuropeSlashMadrid = "Europe/Madrid".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashMadrid]
    
    @scala.inline
    def EuropeSlashMinsk: typings.tzOffset.tzOffsetStrings.EuropeSlashMinsk = "Europe/Minsk".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashMinsk]
    
    @scala.inline
    def EuropeSlashMoscow: typings.tzOffset.tzOffsetStrings.EuropeSlashMoscow = "Europe/Moscow".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashMoscow]
    
    @scala.inline
    def EuropeSlashParis: typings.tzOffset.tzOffsetStrings.EuropeSlashParis = "Europe/Paris".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashParis]
    
    @scala.inline
    def EuropeSlashPrague: typings.tzOffset.tzOffsetStrings.EuropeSlashPrague = "Europe/Prague".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashPrague]
    
    @scala.inline
    def EuropeSlashRiga: typings.tzOffset.tzOffsetStrings.EuropeSlashRiga = "Europe/Riga".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashRiga]
    
    @scala.inline
    def EuropeSlashRome: typings.tzOffset.tzOffsetStrings.EuropeSlashRome = "Europe/Rome".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashRome]
    
    @scala.inline
    def EuropeSlashSamara: typings.tzOffset.tzOffsetStrings.EuropeSlashSamara = "Europe/Samara".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashSamara]
    
    @scala.inline
    def EuropeSlashSarajevo: typings.tzOffset.tzOffsetStrings.EuropeSlashSarajevo = "Europe/Sarajevo".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashSarajevo]
    
    @scala.inline
    def EuropeSlashSkopje: typings.tzOffset.tzOffsetStrings.EuropeSlashSkopje = "Europe/Skopje".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashSkopje]
    
    @scala.inline
    def EuropeSlashSofia: typings.tzOffset.tzOffsetStrings.EuropeSlashSofia = "Europe/Sofia".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashSofia]
    
    @scala.inline
    def EuropeSlashStockholm: typings.tzOffset.tzOffsetStrings.EuropeSlashStockholm = "Europe/Stockholm".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashStockholm]
    
    @scala.inline
    def EuropeSlashTallinn: typings.tzOffset.tzOffsetStrings.EuropeSlashTallinn = "Europe/Tallinn".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashTallinn]
    
    @scala.inline
    def EuropeSlashVienna: typings.tzOffset.tzOffsetStrings.EuropeSlashVienna = "Europe/Vienna".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashVienna]
    
    @scala.inline
    def EuropeSlashVilnius: typings.tzOffset.tzOffsetStrings.EuropeSlashVilnius = "Europe/Vilnius".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashVilnius]
    
    @scala.inline
    def EuropeSlashVolgograd: typings.tzOffset.tzOffsetStrings.EuropeSlashVolgograd = "Europe/Volgograd".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashVolgograd]
    
    @scala.inline
    def EuropeSlashWarsaw: typings.tzOffset.tzOffsetStrings.EuropeSlashWarsaw = "Europe/Warsaw".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashWarsaw]
    
    @scala.inline
    def EuropeSlashZagreb: typings.tzOffset.tzOffsetStrings.EuropeSlashZagreb = "Europe/Zagreb".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashZagreb]
    
    @scala.inline
    def EuropeSlashZurich: typings.tzOffset.tzOffsetStrings.EuropeSlashZurich = "Europe/Zurich".asInstanceOf[typings.tzOffset.tzOffsetStrings.EuropeSlashZurich]
    
    @scala.inline
    def PacificSlashApia: typings.tzOffset.tzOffsetStrings.PacificSlashApia = "Pacific/Apia".asInstanceOf[typings.tzOffset.tzOffsetStrings.PacificSlashApia]
    
    @scala.inline
    def PacificSlashAuckland: typings.tzOffset.tzOffsetStrings.PacificSlashAuckland = "Pacific/Auckland".asInstanceOf[typings.tzOffset.tzOffsetStrings.PacificSlashAuckland]
    
    @scala.inline
    def PacificSlashChatham: typings.tzOffset.tzOffsetStrings.PacificSlashChatham = "Pacific/Chatham".asInstanceOf[typings.tzOffset.tzOffsetStrings.PacificSlashChatham]
    
    @scala.inline
    def PacificSlashFakaofo: typings.tzOffset.tzOffsetStrings.PacificSlashFakaofo = "Pacific/Fakaofo".asInstanceOf[typings.tzOffset.tzOffsetStrings.PacificSlashFakaofo]
    
    @scala.inline
    def PacificSlashFiji: typings.tzOffset.tzOffsetStrings.PacificSlashFiji = "Pacific/Fiji".asInstanceOf[typings.tzOffset.tzOffsetStrings.PacificSlashFiji]
    
    @scala.inline
    def PacificSlashGuadalcanal: typings.tzOffset.tzOffsetStrings.PacificSlashGuadalcanal = "Pacific/Guadalcanal".asInstanceOf[typings.tzOffset.tzOffsetStrings.PacificSlashGuadalcanal]
    
    @scala.inline
    def PacificSlashGuam: typings.tzOffset.tzOffsetStrings.PacificSlashGuam = "Pacific/Guam".asInstanceOf[typings.tzOffset.tzOffsetStrings.PacificSlashGuam]
    
    @scala.inline
    def PacificSlashHonolulu: typings.tzOffset.tzOffsetStrings.PacificSlashHonolulu = "Pacific/Honolulu".asInstanceOf[typings.tzOffset.tzOffsetStrings.PacificSlashHonolulu]
    
    @scala.inline
    def PacificSlashMajuro: typings.tzOffset.tzOffsetStrings.PacificSlashMajuro = "Pacific/Majuro".asInstanceOf[typings.tzOffset.tzOffsetStrings.PacificSlashMajuro]
    
    @scala.inline
    def PacificSlashMidway: typings.tzOffset.tzOffsetStrings.PacificSlashMidway = "Pacific/Midway".asInstanceOf[typings.tzOffset.tzOffsetStrings.PacificSlashMidway]
    
    @scala.inline
    def PacificSlashNoumea: typings.tzOffset.tzOffsetStrings.PacificSlashNoumea = "Pacific/Noumea".asInstanceOf[typings.tzOffset.tzOffsetStrings.PacificSlashNoumea]
    
    @scala.inline
    def PacificSlashPago_Pago: typings.tzOffset.tzOffsetStrings.PacificSlashPago_Pago = "Pacific/Pago_Pago".asInstanceOf[typings.tzOffset.tzOffsetStrings.PacificSlashPago_Pago]
    
    @scala.inline
    def PacificSlashPort_Moresby: typings.tzOffset.tzOffsetStrings.PacificSlashPort_Moresby = "Pacific/Port_Moresby".asInstanceOf[typings.tzOffset.tzOffsetStrings.PacificSlashPort_Moresby]
    
    @scala.inline
    def PacificSlashTongatapu: typings.tzOffset.tzOffsetStrings.PacificSlashTongatapu = "Pacific/Tongatapu".asInstanceOf[typings.tzOffset.tzOffsetStrings.PacificSlashTongatapu]
  }
}
