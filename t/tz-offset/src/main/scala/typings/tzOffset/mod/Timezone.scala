package typings.tzOffset.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
trait Timezone extends js.Object

object Timezone {
  @scala.inline
  def AfricaSlashAlgiers: typings.tzOffset.tzOffsetStrings.AfricaSlashAlgiers = this.cast("Africa/Algiers")
  @scala.inline
  def AfricaSlashCairo: typings.tzOffset.tzOffsetStrings.AfricaSlashCairo = this.cast("Africa/Cairo")
  @scala.inline
  def AfricaSlashCasablanca: typings.tzOffset.tzOffsetStrings.AfricaSlashCasablanca = this.cast("Africa/Casablanca")
  @scala.inline
  def AfricaSlashHarare: typings.tzOffset.tzOffsetStrings.AfricaSlashHarare = this.cast("Africa/Harare")
  @scala.inline
  def AfricaSlashJohannesburg: typings.tzOffset.tzOffsetStrings.AfricaSlashJohannesburg = this.cast("Africa/Johannesburg")
  @scala.inline
  def AfricaSlashMonrovia: typings.tzOffset.tzOffsetStrings.AfricaSlashMonrovia = this.cast("Africa/Monrovia")
  @scala.inline
  def AfricaSlashNairobi: typings.tzOffset.tzOffsetStrings.AfricaSlashNairobi = this.cast("Africa/Nairobi")
  @scala.inline
  def AmericaSlashArgentinaSlashBuenos_Aires: typings.tzOffset.tzOffsetStrings.AmericaSlashArgentinaSlashBuenos_Aires = this.cast("America/Argentina/Buenos_Aires")
  @scala.inline
  def AmericaSlashBogota: typings.tzOffset.tzOffsetStrings.AmericaSlashBogota = this.cast("America/Bogota")
  @scala.inline
  def AmericaSlashCaracas: typings.tzOffset.tzOffsetStrings.AmericaSlashCaracas = this.cast("America/Caracas")
  @scala.inline
  def AmericaSlashChicago: typings.tzOffset.tzOffsetStrings.AmericaSlashChicago = this.cast("America/Chicago")
  @scala.inline
  def AmericaSlashChihuahua: typings.tzOffset.tzOffsetStrings.AmericaSlashChihuahua = this.cast("America/Chihuahua")
  @scala.inline
  def AmericaSlashDenver: typings.tzOffset.tzOffsetStrings.AmericaSlashDenver = this.cast("America/Denver")
  @scala.inline
  def AmericaSlashGodthab: typings.tzOffset.tzOffsetStrings.AmericaSlashGodthab = this.cast("America/Godthab")
  @scala.inline
  def AmericaSlashGuatemala: typings.tzOffset.tzOffsetStrings.AmericaSlashGuatemala = this.cast("America/Guatemala")
  @scala.inline
  def AmericaSlashGuyana: typings.tzOffset.tzOffsetStrings.AmericaSlashGuyana = this.cast("America/Guyana")
  @scala.inline
  def AmericaSlashHalifax: typings.tzOffset.tzOffsetStrings.AmericaSlashHalifax = this.cast("America/Halifax")
  @scala.inline
  def AmericaSlashIndianaSlashIndianapolis: typings.tzOffset.tzOffsetStrings.AmericaSlashIndianaSlashIndianapolis = this.cast("America/Indiana/Indianapolis")
  @scala.inline
  def AmericaSlashJuneau: typings.tzOffset.tzOffsetStrings.AmericaSlashJuneau = this.cast("America/Juneau")
  @scala.inline
  def AmericaSlashLa_Paz: typings.tzOffset.tzOffsetStrings.AmericaSlashLa_Paz = this.cast("America/La_Paz")
  @scala.inline
  def AmericaSlashLima: typings.tzOffset.tzOffsetStrings.AmericaSlashLima = this.cast("America/Lima")
  @scala.inline
  def AmericaSlashLos_Angeles: typings.tzOffset.tzOffsetStrings.AmericaSlashLos_Angeles = this.cast("America/Los_Angeles")
  @scala.inline
  def AmericaSlashMazatlan: typings.tzOffset.tzOffsetStrings.AmericaSlashMazatlan = this.cast("America/Mazatlan")
  @scala.inline
  def AmericaSlashMexico_City: typings.tzOffset.tzOffsetStrings.AmericaSlashMexico_City = this.cast("America/Mexico_City")
  @scala.inline
  def AmericaSlashMonterrey: typings.tzOffset.tzOffsetStrings.AmericaSlashMonterrey = this.cast("America/Monterrey")
  @scala.inline
  def AmericaSlashMontevideo: typings.tzOffset.tzOffsetStrings.AmericaSlashMontevideo = this.cast("America/Montevideo")
  @scala.inline
  def AmericaSlashNew_York: typings.tzOffset.tzOffsetStrings.AmericaSlashNew_York = this.cast("America/New_York")
  @scala.inline
  def AmericaSlashPhoenix: typings.tzOffset.tzOffsetStrings.AmericaSlashPhoenix = this.cast("America/Phoenix")
  @scala.inline
  def AmericaSlashPuerto_Rico: typings.tzOffset.tzOffsetStrings.AmericaSlashPuerto_Rico = this.cast("America/Puerto_Rico")
  @scala.inline
  def AmericaSlashRegina: typings.tzOffset.tzOffsetStrings.AmericaSlashRegina = this.cast("America/Regina")
  @scala.inline
  def AmericaSlashSantiago: typings.tzOffset.tzOffsetStrings.AmericaSlashSantiago = this.cast("America/Santiago")
  @scala.inline
  def AmericaSlashSao_Paulo: typings.tzOffset.tzOffsetStrings.AmericaSlashSao_Paulo = this.cast("America/Sao_Paulo")
  @scala.inline
  def AmericaSlashSt_Johns: typings.tzOffset.tzOffsetStrings.AmericaSlashSt_Johns = this.cast("America/St_Johns")
  @scala.inline
  def AmericaSlashTijuana: typings.tzOffset.tzOffsetStrings.AmericaSlashTijuana = this.cast("America/Tijuana")
  @scala.inline
  def AsiaSlashAlmaty: typings.tzOffset.tzOffsetStrings.AsiaSlashAlmaty = this.cast("Asia/Almaty")
  @scala.inline
  def AsiaSlashBaghdad: typings.tzOffset.tzOffsetStrings.AsiaSlashBaghdad = this.cast("Asia/Baghdad")
  @scala.inline
  def AsiaSlashBaku: typings.tzOffset.tzOffsetStrings.AsiaSlashBaku = this.cast("Asia/Baku")
  @scala.inline
  def AsiaSlashBangkok: typings.tzOffset.tzOffsetStrings.AsiaSlashBangkok = this.cast("Asia/Bangkok")
  @scala.inline
  def AsiaSlashChongqing: typings.tzOffset.tzOffsetStrings.AsiaSlashChongqing = this.cast("Asia/Chongqing")
  @scala.inline
  def AsiaSlashColombo: typings.tzOffset.tzOffsetStrings.AsiaSlashColombo = this.cast("Asia/Colombo")
  @scala.inline
  def AsiaSlashDhaka: typings.tzOffset.tzOffsetStrings.AsiaSlashDhaka = this.cast("Asia/Dhaka")
  @scala.inline
  def AsiaSlashHong_Kong: typings.tzOffset.tzOffsetStrings.AsiaSlashHong_Kong = this.cast("Asia/Hong_Kong")
  @scala.inline
  def AsiaSlashIrkutsk: typings.tzOffset.tzOffsetStrings.AsiaSlashIrkutsk = this.cast("Asia/Irkutsk")
  @scala.inline
  def AsiaSlashJakarta: typings.tzOffset.tzOffsetStrings.AsiaSlashJakarta = this.cast("Asia/Jakarta")
  @scala.inline
  def AsiaSlashJerusalem: typings.tzOffset.tzOffsetStrings.AsiaSlashJerusalem = this.cast("Asia/Jerusalem")
  @scala.inline
  def AsiaSlashKabul: typings.tzOffset.tzOffsetStrings.AsiaSlashKabul = this.cast("Asia/Kabul")
  @scala.inline
  def AsiaSlashKamchatka: typings.tzOffset.tzOffsetStrings.AsiaSlashKamchatka = this.cast("Asia/Kamchatka")
  @scala.inline
  def AsiaSlashKarachi: typings.tzOffset.tzOffsetStrings.AsiaSlashKarachi = this.cast("Asia/Karachi")
  @scala.inline
  def AsiaSlashKathmandu: typings.tzOffset.tzOffsetStrings.AsiaSlashKathmandu = this.cast("Asia/Kathmandu")
  @scala.inline
  def AsiaSlashKolkata: typings.tzOffset.tzOffsetStrings.AsiaSlashKolkata = this.cast("Asia/Kolkata")
  @scala.inline
  def AsiaSlashKrasnoyarsk: typings.tzOffset.tzOffsetStrings.AsiaSlashKrasnoyarsk = this.cast("Asia/Krasnoyarsk")
  @scala.inline
  def AsiaSlashKuala_Lumpur: typings.tzOffset.tzOffsetStrings.AsiaSlashKuala_Lumpur = this.cast("Asia/Kuala_Lumpur")
  @scala.inline
  def AsiaSlashKuwait: typings.tzOffset.tzOffsetStrings.AsiaSlashKuwait = this.cast("Asia/Kuwait")
  @scala.inline
  def AsiaSlashMagadan: typings.tzOffset.tzOffsetStrings.AsiaSlashMagadan = this.cast("Asia/Magadan")
  @scala.inline
  def AsiaSlashMuscat: typings.tzOffset.tzOffsetStrings.AsiaSlashMuscat = this.cast("Asia/Muscat")
  @scala.inline
  def AsiaSlashNovosibirsk: typings.tzOffset.tzOffsetStrings.AsiaSlashNovosibirsk = this.cast("Asia/Novosibirsk")
  @scala.inline
  def AsiaSlashRangoon: typings.tzOffset.tzOffsetStrings.AsiaSlashRangoon = this.cast("Asia/Rangoon")
  @scala.inline
  def AsiaSlashRiyadh: typings.tzOffset.tzOffsetStrings.AsiaSlashRiyadh = this.cast("Asia/Riyadh")
  @scala.inline
  def AsiaSlashSeoul: typings.tzOffset.tzOffsetStrings.AsiaSlashSeoul = this.cast("Asia/Seoul")
  @scala.inline
  def AsiaSlashShanghai: typings.tzOffset.tzOffsetStrings.AsiaSlashShanghai = this.cast("Asia/Shanghai")
  @scala.inline
  def AsiaSlashSingapore: typings.tzOffset.tzOffsetStrings.AsiaSlashSingapore = this.cast("Asia/Singapore")
  @scala.inline
  def AsiaSlashSrednekolymsk: typings.tzOffset.tzOffsetStrings.AsiaSlashSrednekolymsk = this.cast("Asia/Srednekolymsk")
  @scala.inline
  def AsiaSlashTaipei: typings.tzOffset.tzOffsetStrings.AsiaSlashTaipei = this.cast("Asia/Taipei")
  @scala.inline
  def AsiaSlashTashkent: typings.tzOffset.tzOffsetStrings.AsiaSlashTashkent = this.cast("Asia/Tashkent")
  @scala.inline
  def AsiaSlashTbilisi: typings.tzOffset.tzOffsetStrings.AsiaSlashTbilisi = this.cast("Asia/Tbilisi")
  @scala.inline
  def AsiaSlashTehran: typings.tzOffset.tzOffsetStrings.AsiaSlashTehran = this.cast("Asia/Tehran")
  @scala.inline
  def AsiaSlashTokyo: typings.tzOffset.tzOffsetStrings.AsiaSlashTokyo = this.cast("Asia/Tokyo")
  @scala.inline
  def AsiaSlashUlaanbaatar: typings.tzOffset.tzOffsetStrings.AsiaSlashUlaanbaatar = this.cast("Asia/Ulaanbaatar")
  @scala.inline
  def AsiaSlashUrumqi: typings.tzOffset.tzOffsetStrings.AsiaSlashUrumqi = this.cast("Asia/Urumqi")
  @scala.inline
  def AsiaSlashVladivostok: typings.tzOffset.tzOffsetStrings.AsiaSlashVladivostok = this.cast("Asia/Vladivostok")
  @scala.inline
  def AsiaSlashYakutsk: typings.tzOffset.tzOffsetStrings.AsiaSlashYakutsk = this.cast("Asia/Yakutsk")
  @scala.inline
  def AsiaSlashYekaterinburg: typings.tzOffset.tzOffsetStrings.AsiaSlashYekaterinburg = this.cast("Asia/Yekaterinburg")
  @scala.inline
  def AsiaSlashYerevan: typings.tzOffset.tzOffsetStrings.AsiaSlashYerevan = this.cast("Asia/Yerevan")
  @scala.inline
  def AtlanticSlashAzores: typings.tzOffset.tzOffsetStrings.AtlanticSlashAzores = this.cast("Atlantic/Azores")
  @scala.inline
  def AtlanticSlashCape_Verde: typings.tzOffset.tzOffsetStrings.AtlanticSlashCape_Verde = this.cast("Atlantic/Cape_Verde")
  @scala.inline
  def AtlanticSlashSouth_Georgia: typings.tzOffset.tzOffsetStrings.AtlanticSlashSouth_Georgia = this.cast("Atlantic/South_Georgia")
  @scala.inline
  def AustraliaSlashAdelaide: typings.tzOffset.tzOffsetStrings.AustraliaSlashAdelaide = this.cast("Australia/Adelaide")
  @scala.inline
  def AustraliaSlashBrisbane: typings.tzOffset.tzOffsetStrings.AustraliaSlashBrisbane = this.cast("Australia/Brisbane")
  @scala.inline
  def AustraliaSlashDarwin: typings.tzOffset.tzOffsetStrings.AustraliaSlashDarwin = this.cast("Australia/Darwin")
  @scala.inline
  def AustraliaSlashHobart: typings.tzOffset.tzOffsetStrings.AustraliaSlashHobart = this.cast("Australia/Hobart")
  @scala.inline
  def AustraliaSlashMelbourne: typings.tzOffset.tzOffsetStrings.AustraliaSlashMelbourne = this.cast("Australia/Melbourne")
  @scala.inline
  def AustraliaSlashPerth: typings.tzOffset.tzOffsetStrings.AustraliaSlashPerth = this.cast("Australia/Perth")
  @scala.inline
  def AustraliaSlashSydney: typings.tzOffset.tzOffsetStrings.AustraliaSlashSydney = this.cast("Australia/Sydney")
  @scala.inline
  def EtcSlashGMTPlussign12: typings.tzOffset.tzOffsetStrings.EtcSlashGMTPlussign12 = this.cast("Etc/GMT+12")
  @scala.inline
  def EtcSlashUTC: typings.tzOffset.tzOffsetStrings.EtcSlashUTC = this.cast("Etc/UTC")
  @scala.inline
  def EuropeSlashAmsterdam: typings.tzOffset.tzOffsetStrings.EuropeSlashAmsterdam = this.cast("Europe/Amsterdam")
  @scala.inline
  def EuropeSlashAthens: typings.tzOffset.tzOffsetStrings.EuropeSlashAthens = this.cast("Europe/Athens")
  @scala.inline
  def EuropeSlashBelgrade: typings.tzOffset.tzOffsetStrings.EuropeSlashBelgrade = this.cast("Europe/Belgrade")
  @scala.inline
  def EuropeSlashBerlin: typings.tzOffset.tzOffsetStrings.EuropeSlashBerlin = this.cast("Europe/Berlin")
  @scala.inline
  def EuropeSlashBratislava: typings.tzOffset.tzOffsetStrings.EuropeSlashBratislava = this.cast("Europe/Bratislava")
  @scala.inline
  def EuropeSlashBrussels: typings.tzOffset.tzOffsetStrings.EuropeSlashBrussels = this.cast("Europe/Brussels")
  @scala.inline
  def EuropeSlashBucharest: typings.tzOffset.tzOffsetStrings.EuropeSlashBucharest = this.cast("Europe/Bucharest")
  @scala.inline
  def EuropeSlashBudapest: typings.tzOffset.tzOffsetStrings.EuropeSlashBudapest = this.cast("Europe/Budapest")
  @scala.inline
  def EuropeSlashCopenhagen: typings.tzOffset.tzOffsetStrings.EuropeSlashCopenhagen = this.cast("Europe/Copenhagen")
  @scala.inline
  def EuropeSlashDublin: typings.tzOffset.tzOffsetStrings.EuropeSlashDublin = this.cast("Europe/Dublin")
  @scala.inline
  def EuropeSlashHelsinki: typings.tzOffset.tzOffsetStrings.EuropeSlashHelsinki = this.cast("Europe/Helsinki")
  @scala.inline
  def EuropeSlashIstanbul: typings.tzOffset.tzOffsetStrings.EuropeSlashIstanbul = this.cast("Europe/Istanbul")
  @scala.inline
  def EuropeSlashKaliningrad: typings.tzOffset.tzOffsetStrings.EuropeSlashKaliningrad = this.cast("Europe/Kaliningrad")
  @scala.inline
  def EuropeSlashKiev: typings.tzOffset.tzOffsetStrings.EuropeSlashKiev = this.cast("Europe/Kiev")
  @scala.inline
  def EuropeSlashLisbon: typings.tzOffset.tzOffsetStrings.EuropeSlashLisbon = this.cast("Europe/Lisbon")
  @scala.inline
  def EuropeSlashLjubljana: typings.tzOffset.tzOffsetStrings.EuropeSlashLjubljana = this.cast("Europe/Ljubljana")
  @scala.inline
  def EuropeSlashLondon: typings.tzOffset.tzOffsetStrings.EuropeSlashLondon = this.cast("Europe/London")
  @scala.inline
  def EuropeSlashMadrid: typings.tzOffset.tzOffsetStrings.EuropeSlashMadrid = this.cast("Europe/Madrid")
  @scala.inline
  def EuropeSlashMinsk: typings.tzOffset.tzOffsetStrings.EuropeSlashMinsk = this.cast("Europe/Minsk")
  @scala.inline
  def EuropeSlashMoscow: typings.tzOffset.tzOffsetStrings.EuropeSlashMoscow = this.cast("Europe/Moscow")
  @scala.inline
  def EuropeSlashParis: typings.tzOffset.tzOffsetStrings.EuropeSlashParis = this.cast("Europe/Paris")
  @scala.inline
  def EuropeSlashPrague: typings.tzOffset.tzOffsetStrings.EuropeSlashPrague = this.cast("Europe/Prague")
  @scala.inline
  def EuropeSlashRiga: typings.tzOffset.tzOffsetStrings.EuropeSlashRiga = this.cast("Europe/Riga")
  @scala.inline
  def EuropeSlashRome: typings.tzOffset.tzOffsetStrings.EuropeSlashRome = this.cast("Europe/Rome")
  @scala.inline
  def EuropeSlashSamara: typings.tzOffset.tzOffsetStrings.EuropeSlashSamara = this.cast("Europe/Samara")
  @scala.inline
  def EuropeSlashSarajevo: typings.tzOffset.tzOffsetStrings.EuropeSlashSarajevo = this.cast("Europe/Sarajevo")
  @scala.inline
  def EuropeSlashSkopje: typings.tzOffset.tzOffsetStrings.EuropeSlashSkopje = this.cast("Europe/Skopje")
  @scala.inline
  def EuropeSlashSofia: typings.tzOffset.tzOffsetStrings.EuropeSlashSofia = this.cast("Europe/Sofia")
  @scala.inline
  def EuropeSlashStockholm: typings.tzOffset.tzOffsetStrings.EuropeSlashStockholm = this.cast("Europe/Stockholm")
  @scala.inline
  def EuropeSlashTallinn: typings.tzOffset.tzOffsetStrings.EuropeSlashTallinn = this.cast("Europe/Tallinn")
  @scala.inline
  def EuropeSlashVienna: typings.tzOffset.tzOffsetStrings.EuropeSlashVienna = this.cast("Europe/Vienna")
  @scala.inline
  def EuropeSlashVilnius: typings.tzOffset.tzOffsetStrings.EuropeSlashVilnius = this.cast("Europe/Vilnius")
  @scala.inline
  def EuropeSlashVolgograd: typings.tzOffset.tzOffsetStrings.EuropeSlashVolgograd = this.cast("Europe/Volgograd")
  @scala.inline
  def EuropeSlashWarsaw: typings.tzOffset.tzOffsetStrings.EuropeSlashWarsaw = this.cast("Europe/Warsaw")
  @scala.inline
  def EuropeSlashZagreb: typings.tzOffset.tzOffsetStrings.EuropeSlashZagreb = this.cast("Europe/Zagreb")
  @scala.inline
  def EuropeSlashZurich: typings.tzOffset.tzOffsetStrings.EuropeSlashZurich = this.cast("Europe/Zurich")
  @scala.inline
  def PacificSlashApia: typings.tzOffset.tzOffsetStrings.PacificSlashApia = this.cast("Pacific/Apia")
  @scala.inline
  def PacificSlashAuckland: typings.tzOffset.tzOffsetStrings.PacificSlashAuckland = this.cast("Pacific/Auckland")
  @scala.inline
  def PacificSlashChatham: typings.tzOffset.tzOffsetStrings.PacificSlashChatham = this.cast("Pacific/Chatham")
  @scala.inline
  def PacificSlashFakaofo: typings.tzOffset.tzOffsetStrings.PacificSlashFakaofo = this.cast("Pacific/Fakaofo")
  @scala.inline
  def PacificSlashFiji: typings.tzOffset.tzOffsetStrings.PacificSlashFiji = this.cast("Pacific/Fiji")
  @scala.inline
  def PacificSlashGuadalcanal: typings.tzOffset.tzOffsetStrings.PacificSlashGuadalcanal = this.cast("Pacific/Guadalcanal")
  @scala.inline
  def PacificSlashGuam: typings.tzOffset.tzOffsetStrings.PacificSlashGuam = this.cast("Pacific/Guam")
  @scala.inline
  def PacificSlashHonolulu: typings.tzOffset.tzOffsetStrings.PacificSlashHonolulu = this.cast("Pacific/Honolulu")
  @scala.inline
  def PacificSlashMajuro: typings.tzOffset.tzOffsetStrings.PacificSlashMajuro = this.cast("Pacific/Majuro")
  @scala.inline
  def PacificSlashMidway: typings.tzOffset.tzOffsetStrings.PacificSlashMidway = this.cast("Pacific/Midway")
  @scala.inline
  def PacificSlashNoumea: typings.tzOffset.tzOffsetStrings.PacificSlashNoumea = this.cast("Pacific/Noumea")
  @scala.inline
  def PacificSlashPago_Pago: typings.tzOffset.tzOffsetStrings.PacificSlashPago_Pago = this.cast("Pacific/Pago_Pago")
  @scala.inline
  def PacificSlashPort_Moresby: typings.tzOffset.tzOffsetStrings.PacificSlashPort_Moresby = this.cast("Pacific/Port_Moresby")
  @scala.inline
  def PacificSlashTongatapu: typings.tzOffset.tzOffsetStrings.PacificSlashTongatapu = this.cast("Pacific/Tongatapu")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

